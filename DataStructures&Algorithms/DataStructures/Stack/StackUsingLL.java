class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top;
    void push(int value){
        Node newNode=new Node(value);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
        System.out.println(value+ "pushed into the stack");
    }
    void pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data+"popped from the stack");
        top=top.next;
    }  
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top element: "+ top.data);
        }
    } 
    void display(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Node currHead=top;
        while(currHead!=null){
            System.out.println(currHead.data);
            currHead=currHead.next;
        }
    }
}
public class StackUsingLL {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
    }
}
