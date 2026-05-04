import java.util.*;
public class PersonVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("The person's age is "+age+ " can Vote");
        }else{
            System.out.println("The person's age is "+age+ " cannot Vote");
        }
    }
}
