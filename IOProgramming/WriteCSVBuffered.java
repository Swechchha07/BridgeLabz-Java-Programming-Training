import java.io.*;
public class WriteCSVBuffered {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("data.csv"))){
            bw.write("ID,Name,Age");
            bw.newLine();
            bw.write("1,Aman,20");
            bw.newLine();

            bw.write("2,Sonal,21");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
