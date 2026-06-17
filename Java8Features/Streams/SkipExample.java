import java.util.*;
import java.util.stream.*;
public class SkipExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        nums.stream()
            .skip(2)
            .forEach(System.out::println);
    }
}
