class Queue{
    int[] arr;
    int front;
    int rear;
    int size;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        int front=-1;
        int rear=-1;
    }
    void enqueue(int value){
        if(rear==size-1){
            System.out.println("Queue is overflow");
        }else{
            if(front==-1){
                front=0;
            }
            rear++;
            arr[rear]=value;
            System.out.println(value+ "inserted at queue");
        }
    }
    void dequeue(){
        if(front==-1){
            System.out.println("Queue is underflow");
        }else{
            System.out.println(arr[front]+"popped from queue");
            front++;
        }
    }
    void peek(){
        if(front==-1){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Peek element is: "+ arr[front]);
        }
    }
    void display(){
        if(front==-1){
            System.out.println("Queue is empty");
        }else{
            for(int i=front;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.peek();
        
    }
}
