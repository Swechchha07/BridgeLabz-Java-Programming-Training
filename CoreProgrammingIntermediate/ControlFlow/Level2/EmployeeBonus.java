import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        int service=sc.nextInt();
        double bonus=0;
        if(service>5){
            bonus=salary*0.05;
        }
        System.out.println("Bonus amount: "+bonus);
    }
}
