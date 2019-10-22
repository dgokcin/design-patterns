package behavioral.nullObject;

public class Earth implements Planet {
    @Override
    public String name() {
        return "Earth";
    }

    @Override
    public void rotate() {
        System.out.println("Earth is rotating....");

    }

    public void printName() {
        System.out.println(name());
    }
}
