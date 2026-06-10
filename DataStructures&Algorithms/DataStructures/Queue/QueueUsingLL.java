class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node front;
    Node rear;
    void enqueue(int value){
        Node newNode=new Node(value);
        if(front==null){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        System.out.println(value+" inserted at queue");
    }
    void dequeue(){
        if(front==null){
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(front.data+"removed from the queue");
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    void peek(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Peek element is: "+ front.data);
        }
    }
    void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node currNode=front;
            while(currNode!=null){
                System.out.println(currNode.data);
                currNode=currNode.next;
            }
        }
    }
}
public class QueueUsingLL {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.peek();
        q.dequeue();
        
    }
}
