import java.io.*;
public class BufferReader{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.print(line);
        }
        br.close();
    }
}