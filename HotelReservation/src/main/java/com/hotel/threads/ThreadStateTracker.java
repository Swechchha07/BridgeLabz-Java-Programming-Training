package com.hotel.threads;

public class ThreadStateTracker {

    public static void demonstrateLifecycle() throws Exception {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("NEW : " + t.getState());

        t.start();

        Thread.sleep(100);

        System.out.println("RUNNING : " + t.getState());

        t.join();

        System.out.println("TERMINATED : " + t.getState());
    }
}