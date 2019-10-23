package creational.singleton.BetterSingleton;

//defines an instance operation that lets clients access its unique instance.
//Control over how and when clients access it.
//Use when there must be exactly one instance of a class, and it must be accessible
//to clients from a well-known access point.

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SingleThreadedSingleton singleton = SingleThreadedSingleton.getInstance("FOO");
        SingleThreadedSingleton anotherSingleton = SingleThreadedSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
