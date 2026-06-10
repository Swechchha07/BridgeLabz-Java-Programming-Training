class Box<T>{
    T value;
    Box(T value){
        this.value=value;
    }
    void show(){
        System.out.println("value is: "+ value);
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> b1=new Box<>(10);
        b1.show();
        Box<String> b2=new Box<>("Hello");
        b2.show();
    }
}
