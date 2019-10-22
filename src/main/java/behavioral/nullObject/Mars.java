package behavioral.nullObject;

public class Mars implements Planet {
    @Override
    public String name() {
        return "Mars";
    }

    @Override
    public void rotate() {
        System.out.println("Mars is rotating....");

    }

    public void printName() {
        System.out.println(name());
    }
}
