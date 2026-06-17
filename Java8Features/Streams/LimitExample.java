import java.util.*;
import java.util.stream.*;
public class LimitExample{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        Stream.iterate(1,n->n+1)
            .limit(3)
            .forEach(System.out::println);
    }
}