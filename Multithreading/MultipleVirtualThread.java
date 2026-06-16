public class MultipleVirtualThread {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            Thread.startVirtualThread(() -> {
                System.out.println("Task " + taskId +" executed by " +Thread.currentThread());
            });
        }

        Thread.sleep(1000); 
    }
}
