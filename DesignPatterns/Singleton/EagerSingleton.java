class EagerSingleton {
     private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
    }
    public static EagerSingleton getInstance() {
        return instance;
    }
     public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();

        System.out.println(obj1 == obj2);
    }
}