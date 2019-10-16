package creational.singleton.SloppySingleton;

public class SingletonDemo {
    private static SingletonDemo SingletonInstance = new SingletonDemo();

    private SingletonDemo(){
        System.out.println("Singleton Demo initialized");
    }

    public static SingletonDemo getSingletonInstance(){
        return SingletonInstance;
    }

public static void main(String[] args) {
    System.out.println("SingletonDemo");

    SingletonDemo x = SingletonDemo.getSingletonInstance();
    SingletonDemo y = SingletonDemo.getSingletonInstance();

    System.out.println("X's hashcode is: " + x.hashCode());
    System.out.println("Y's hashcode is: " + y.hashCode());

    }
}

