import java.util.*;
public class DoubleOpt {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4=a%b+c;
        System.out.println("The result of Int Operartios are " + result1 + " " + result2 +" "+ result3 +" "+ result4);
    
    }
}
