import java.util.regex.*;
public class PhoneNumValidation{
    public static void main(String[] args){
        String phone="9068124109";
        String regex="^[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(phone);
        if(m.matches()){
            System.out.println("Valid phone num");
        }else{
            System.out.println("Not valid");
        }
    }
}