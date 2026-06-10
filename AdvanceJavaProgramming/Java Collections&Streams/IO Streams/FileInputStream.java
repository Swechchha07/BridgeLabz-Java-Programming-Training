import java.io.*;
public class FileInputStream{
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("abc.txt");
        int data;
        while((data=fis.read())!=-1){
            System.out.print(char(data));
        }
        fis.close();
    }
}