import java.util.*;
import java.util.stream.*;
public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(2,2,4,5,6,6);
        nums.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
