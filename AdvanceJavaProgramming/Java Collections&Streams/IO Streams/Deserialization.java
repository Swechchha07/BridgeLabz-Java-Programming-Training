import java.io.*;
public class Deserialization{
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
        Student s=(Student) ois.readObject();
        System.out.println(s.id);
        System.out.println(s.name);
        ois.close();
    }
}