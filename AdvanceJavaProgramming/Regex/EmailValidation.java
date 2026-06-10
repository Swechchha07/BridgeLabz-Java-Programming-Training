import java.util.regex.*;
public class EmailValidation {
    public static void main(String[] args){
        String email="nigam316@gmail.com";
        String regex="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        if(m.matches()){
            System.out.println("Valid email");
        }else{
            System.out.println("Not Valid");
        }
    }
}
