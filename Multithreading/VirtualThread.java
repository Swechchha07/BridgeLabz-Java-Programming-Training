public class VirtualThread {
    public static void main(String[] args) {
        Thread virtualThread=Thread.startVirtualThread(()->{
            System.out.println("Hello from virtual thread");
            System.out.println("Current Thread: "+ Thread.currentThread());
        });
        try{
            virtualThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main Thread finished");
    }
}
