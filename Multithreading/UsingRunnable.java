class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread executing: "+ i);
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        MyRunnable m1=new MyRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
