package creational.singleton.BetterSingleton;

public final class SingleThreadedSingleton{
    private static SingleThreadedSingleton instance;
    public String value;

    // private construcor
    private SingleThreadedSingleton(String value) {
        // Following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingleThreadedSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SingleThreadedSingleton(value);
        }
        return instance;
    }
}
