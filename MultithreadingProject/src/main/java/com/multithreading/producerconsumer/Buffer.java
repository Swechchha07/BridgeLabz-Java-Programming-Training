package com.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int capacity;
    public Buffer(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(value);
        System.out.println(Thread.currentThread().getName()+ " Produced : "+ value);
        notifyAll();
    }
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.remove();
        System.out.println(Thread.currentThread().getName() + " Consumed : " + value);
        notifyAll();
        return value;
    }
}