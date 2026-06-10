import java.io.*;
public class FileOutputStream{
    public static void main(String[] args) throws IOException{
        FileOutputStream fos=new FileOutputStream("abc.txt");
        String str="Hello Java";
        fos.write(str.getBytes());
        fos.close();
        System.out.println("Data written");
    }
}