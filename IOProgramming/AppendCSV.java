import java.io.*;
public class AppendCSV {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("students.csv",true))){
            //bw.newLine();
            bw.write("3,Neha,23");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
