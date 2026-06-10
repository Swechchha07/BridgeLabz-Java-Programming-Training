class Pair<K,V>{
    K key;
    V value;
    Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    void display(){
        System.out.println(key+ " "+ value);
    }
}
public class MultiTypePara {
    public static void main(String[] args) {
        Pair<Integer,String> p=new Pair<>(101,"Swechchha");
        p.display();
        
    }
}
