import java.util.*;
import java.util.stream.*;
public class CountExample {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Ram","Shyam","Mohan");
        long count=names.stream().count();
            System.out.println(count);

    }
}
