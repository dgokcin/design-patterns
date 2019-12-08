package structural.decorator;

public class StandardCar implements Car {
    @Override
    public void build() {
        System.out.println("Standard Car");
    }
}

