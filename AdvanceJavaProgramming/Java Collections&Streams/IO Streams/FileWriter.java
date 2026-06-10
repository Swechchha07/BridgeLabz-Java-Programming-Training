import java.io.*;
public class FileWriter{
    public static void main(String[] args){
        FileWriter fw=new FileWriter("abc.txt");
        fw.write("Welcome to Java");
        fw.close();
        System.out.println("Data writtern");
    }
}
