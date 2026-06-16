import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {
        String file = "students.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println("ID: " + data[0] +", Name: " + data[1] +", Age: " + data[2]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}