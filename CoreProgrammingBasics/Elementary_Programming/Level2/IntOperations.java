import java.util.*;
public class IntOperations {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int result1=a+b*c;
        int result2=a*b+c;
        int result3=c+a/b;
        int result4=a%b+c;
        System.out.println("The result of Int Operartios are " + result1 + " " + result2 +" "+ result3 +" "+ result4);
    }
}
