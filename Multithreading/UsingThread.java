class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread running: "+ i);
        }
    }
}
public class UsingThread {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
        
    }
}
