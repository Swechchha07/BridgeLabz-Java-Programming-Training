import java.util.regex.*;
public class ExtractEmail {
    public static void main(String[] args) {
        String text="Contact: nigam316@gmail.com, abc@gmail.com, xyz@gmail.com";
        String regex="[a-zA-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
    
}
