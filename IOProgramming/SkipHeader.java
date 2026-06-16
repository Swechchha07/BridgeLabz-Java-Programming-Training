import java.io.*;

public class SkipHeader {
    public static void main(String[] args) {
        try (BufferedReader br =new BufferedReader(new FileReader("students.csv"))) {
            br.readLine(); 
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Name: " + data[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}