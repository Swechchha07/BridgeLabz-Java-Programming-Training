import java.io.*;
public class ByteArrayInputStream{
    public static void main(String[] args) throws Exception{
        byte[] arr={65,66,67,68};
        ByteArrayInputStream bis=new ByteArrayInputStream(arr);
        int data;
        while((data=bis.read)!=-1){
            System.out.println((char)data);
        }
    }
}