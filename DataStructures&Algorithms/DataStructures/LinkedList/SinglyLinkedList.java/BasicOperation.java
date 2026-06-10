class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class BasicOperation{
    Node head;
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    void addSpecificPosition(int position,int data){
        Node newNode=new Node(data);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;


        }
        Node currHead=head;
        for(int i=1;i<position-1;i++){
            if(currHead==null){
                System.out.println("Invalid Position");
            }
            currHead=currHead.next;
        }
        newNode.next = currHead.next;
        currHead.next = newNode;
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;

    }
    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }
    void deleteSpecific(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==1){
            head=head.next;
            return;
        }
        Node currHead=head;
        for(int i=0;i<position-1;i++){
            if(currHead.next==null||currHead==null){
                System.out.println("Invalid Position");
                return;
            }
            currHead=currHead.next;
        }
        if(currHead.next==null){
            System.out.println("Invalid position");
            return;
        }
        currHead.next=currHead.next.next;
    }
    void display(){
        Node currHead=head;
        while(currHead!=null){
            System.out.print(currHead.data+"->");
            currHead=currHead.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        BasicOperation list=new BasicOperation();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();
        list.addLast(40);
        list.display();
        list.addSpecificPosition(2,40 );
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteSpecific(2);
        list.display();

    }
}