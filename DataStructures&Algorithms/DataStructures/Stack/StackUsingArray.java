class Stack{
    int maxSize;
    int[] stack;
    int top;
    Stack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[maxSize];
        top=-1;
    }
    void push(int value){
    if(top==maxSize-1){
        System.out.println("Stack Overflow");
    }else{
        top++;
        stack[top]=value;
        System.out.println(value+" pushed into the stack");
    }
}
void pop(){
    if(top==-1){
        System.out.println("Stack underflow");
    }else{
        System.out.println(stack[top]+" popped from the stack");
        top--;
    }
}
void peek(){
    if(top==-1){
        System.out.println("Stack is empty");
    }else{
        System.out.println("Top element of stack is: "+stack[top]);
    }
}
void display(){
    if(top==-1){
        System.out.println("Stack is empty");
    }else{
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.peek();
    }
}
