@FunctionalInterface
interface Length {
    int getLength(String s);
    
}

public class StringLength {
    public static void main(String[] args) {
        Length len=str->str.length();
        System.out.println(len.getLength("Java"));
    }
}
