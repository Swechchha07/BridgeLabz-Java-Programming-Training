import java.io.*;
public class FileReader{
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("abc.txt");
        int data;
        while((data=fr.read())!=-1){
            System.out.println((char)data);
        }
        fr.close();
    }
}