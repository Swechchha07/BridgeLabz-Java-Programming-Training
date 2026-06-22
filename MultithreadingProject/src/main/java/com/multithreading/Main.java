package com.multithreading;

import com.multithreading.lifecycle.ThreadStateDemo;
import com.multithreading.producerconsumer.ProducerConsumerDemo;
import com.multithreading.singleton.SingletonConcurrencyDemo;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("THREAD STATES");
        ThreadStateDemo.demonstrate();
        System.out.println("PRODUCER CONSUMER");
        ProducerConsumerDemo.runTraditionalDemo();
        ProducerConsumerDemo.runVirtualThreadDemo();
        System.out.println("SINGLETON");
        SingletonConcurrencyDemo.runDemo();
    }
}