import java.io.*;
public class WriteCSV {
    public static void main(String[] args) {
        try(FileWriter writer=new FileWriter("students.csv")){
            writer.append("ID,Name,Age\n");
            writer.append("1,Rahul,20\n");
            writer.append("2,Priya,21\n");

            System.out.println("CSV file created successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
