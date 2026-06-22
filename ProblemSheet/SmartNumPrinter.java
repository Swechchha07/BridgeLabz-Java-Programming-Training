class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 51; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class SmartNumPrinter {
    public static void main(String[] args) throws InterruptedException {

        ThreadA t1 = new ThreadA();
        t1.setName("Thread-A");

        Thread t2 = new Thread(new ThreadB());
        t2.setName("Thread-B");

        Runnable r = () -> {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(Thread.currentThread().getName() + " : " + ch);
            }
        };

        Thread t3 = new Thread(r);
        t3.setName("Thread-C");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed.");
    }
}