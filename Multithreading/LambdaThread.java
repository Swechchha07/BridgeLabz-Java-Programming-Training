public class LambdaThread {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("Lambda Thread Running");
        });
        t.start();
    }
}
