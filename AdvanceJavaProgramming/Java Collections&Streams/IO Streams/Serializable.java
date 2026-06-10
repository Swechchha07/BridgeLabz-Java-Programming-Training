import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
public class Serializable{
    public static void main(String[] args) throws Exception{
        Student s=new Student(1,"Swechchha");
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("abc.txt"));
        os.writeObject(s);
        os.close();
        System.out.println("Object Saved");
    }
}