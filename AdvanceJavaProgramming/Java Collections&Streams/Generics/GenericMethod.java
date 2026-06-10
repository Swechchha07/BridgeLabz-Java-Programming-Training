class Demo{
    public<T> void printData(T data){
        System.out.println(data);
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.printData(10);
        d.printData("Hello");
    }
}
