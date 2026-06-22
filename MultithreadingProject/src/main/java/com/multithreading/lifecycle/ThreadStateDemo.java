package com.multithreading.lifecycle;

public class ThreadStateDemo {

    public static void demonstrate() throws Exception {
        Object waitLock = new Object();
        Object blockLock = new Object();
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronized (waitLock) {
                    waitLock.wait();
                }
                synchronized (blockLock) {
                    System.out.println("Worker Thread acquired blockLock");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println("NEW : " + t.getState());
        t.start();
        System.out.println("RUNNABLE : " + t.getState());
        Thread.sleep(500);
        System.out.println("TIMED_WAITING : " + t.getState());
        Thread.sleep(700);
        System.out.println("WAITING : " + t.getState());
        synchronized (waitLock) {
            waitLock.notify();
        }
        synchronized (blockLock) {
            Thread.sleep(200);
            Thread.sleep(200);
            System.out.println("BLOCKED : " + t.getState());
        }
        t.join();
        System.out.println("TERMINATED : " + t.getState());
    }
}