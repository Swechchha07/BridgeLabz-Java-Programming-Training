import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos =
                new FileOutputStream("abc.txt");

        BufferedOutputStream bos =
                new BufferedOutputStream(fos);

        String str = "Hello Java BufferedOutputStream";

        byte arr[] = str.getBytes();

        bos.write(arr);

        bos.close();

        System.out.println("Data Written Successfully");
    }
}