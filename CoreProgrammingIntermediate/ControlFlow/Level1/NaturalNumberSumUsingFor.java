import java.util.*;
public class NaturalNumberSumUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not natural number");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println(sum);
        System.out.println(sumFormula);
        if (sum == sumFormula) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results do not match");
        }
    }
}