import java.nio.file.*;
import java.util.*;

public class ReadAllLine {
    public static void main(String[] args)throws Exception {
        List<String> lines =Files.readAllLines(Path.of("contacts.csv"));
        System.out.println(lines);
    }
}