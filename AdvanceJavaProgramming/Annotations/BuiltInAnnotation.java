import java.util.*;
class Parent{
    void display(){
        System.out.println("This is a parent method");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("This is a child method");
    }
}
class Demo{
    @Deprecated
    void oldMethod(){
        System.out.println("This is a old method");
    }
}
public class AnnotationExample{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        Child c=new Child();
        c.display();
        Demo d=new Demo();
        d.oldMethod();
      
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");

        System.out.println(list);
    }
}
