import java.util.*;
public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid num");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact =fact* i;
        }
        System.out.println("Factorial = " + fact);
    }
}