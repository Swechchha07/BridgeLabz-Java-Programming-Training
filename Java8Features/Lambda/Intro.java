interface Greeting {
    void sayHello();
    
}
public class Intro {
    public static void main(String[] args) {
        Greeting g=()->System.out.println("Hello");
        g.sayHello();
    }
}
