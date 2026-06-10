import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedWriter bw =new BufferedWriter(new FileWriter("abc.txt"));

        bw.write("Hello Java");
        bw.newLine();
        bw.write("BufferedWriter Example");

        bw.close();

        System.out.println("Data Written Successfully");
    }
}