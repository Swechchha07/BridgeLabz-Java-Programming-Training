class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoublyLL{
    Node head;
    Node tail;
    DoublyLL(){
        this.head=null;
        this.tail=null;
    }
    void addFirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    void addLast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deleteLast(){
        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    void printList(){
        Node currHead=head;
        while(currHead!=null){
            System.out.println(currHead.data);
            currHead=currHead.next;
        }
    }

}
public class DoubleLL{
    public static void main(String[] args){
        DoublyLL list=new DoublyLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList();
        list.addLast(40);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}