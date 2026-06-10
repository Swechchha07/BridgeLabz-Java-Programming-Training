import java.util.regex.*;
public class PasswordValid{
    public static void main(String[] args){
        String text="Java@123";
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(text);
        if(m.matches()){
            System.out.println("Strong Password");
        }else{
            System.out.println("Weak Password");
        }
        
    }
}