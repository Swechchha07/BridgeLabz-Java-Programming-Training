package com.multithreading.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonConcurrencyDemo {
    public static void runDemo() throws Exception {
        Set<Integer> unsafeHashCodes = ConcurrentHashMap.newKeySet();
        Thread[] threads = new Thread[50];
        for (int i = 0; i < 50; i++) {
            threads[i] = new Thread(() -> {
                UnsafeSingleton obj = UnsafeSingleton.getInstance();
                unsafeHashCodes.add(obj.hashCode());
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("Unsafe Instances : " + unsafeHashCodes.size());
        Set<Integer> safeHashCodes = ConcurrentHashMap.newKeySet();
        Thread[] threads2 = new Thread[50];
        for (int i = 0; i < 50; i++) {
            threads2[i] = new Thread(() -> {
                SafeSingleton obj = SafeSingleton.getInstance();
                safeHashCodes.add(obj.hashCode());
            });

            threads2[i].start();
        }

        for (Thread t : threads2) {
            t.join();
        }
        System.out.println("Safe Instances : " + safeHashCodes.size());
    }
}