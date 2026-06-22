class Road extends Thread {

    public void run() {
        System.out.println(getName() + " : GREEN Signal");
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " : Signal Over");
        Thread.yield();
    }
}
public class TrafficSignal{
    public static void main(String[] args) throws InterruptedException {
        Road r1 = new Road();
        r1.setName("Road-1");
        Road r2 = new Road();
        r2.setName("Road-2");
        Road r3 = new Road();
        r3.setName("Road-3");
        
        r1.start();
        r2.start();
        r3.start();

        r1.join();
        r2.join();
        r3.join();

        System.out.println("Traffic Signal Completed");
    }
}