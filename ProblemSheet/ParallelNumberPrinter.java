class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 51; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class ParallelNumberPrinter {
    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1();
        t1.setName("Thread-1");

        Thread2 r = new Thread2();
        Thread t2 = new Thread(r);
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads completed.");
    }
}