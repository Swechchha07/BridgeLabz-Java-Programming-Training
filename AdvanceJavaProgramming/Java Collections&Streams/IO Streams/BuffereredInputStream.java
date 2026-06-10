import java.io.*;
public class BufferedInputStream{
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("abc.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int data;
        while((data=bis.read())!=-1){
            System.out.print((char) data);
        }
        bis.close();
    }
}