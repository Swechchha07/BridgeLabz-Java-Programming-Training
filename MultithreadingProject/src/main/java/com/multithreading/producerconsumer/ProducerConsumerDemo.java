package com.multithreading.producerconsumer;

public class ProducerConsumerDemo {
    public static void runTraditionalDemo() throws Exception {
        System.out.println("Traditional Threads");
        Buffer buffer = new Buffer(3);
        Producer producer = new Producer(buffer);
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");
        producer.start();
        consumerThread.start();
        producer.join();
        consumerThread.join();
    }
    public static void runVirtualThreadDemo() throws Exception {

        System.out.println("Virtual Threads");
        Buffer buffer = new Buffer(3);
        Runnable producerTask = () -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable consumerTask = () -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread producer = Thread.ofVirtual().name("VirtualProducer").start(producerTask);
        Thread consumer = Thread.ofVirtual().name("VirtualConsumer").start(consumerTask);
        producer.join();
        consumer.join();
    }
}