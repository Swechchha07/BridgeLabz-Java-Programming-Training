class UserTask extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
    }
}

class CleanupThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Cleaning temporary files...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DaemonDemo {

    public static void main(String[] args) throws InterruptedException {

        UserTask t1 = new UserTask();
        UserTask t2 = new UserTask();

        t1.setName("User-1");
        t2.setName("User-2");

        CleanupThread daemon = new CleanupThread();
        daemon.setDaemon(true);

        daemon.start();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All user threads completed");
    }
}