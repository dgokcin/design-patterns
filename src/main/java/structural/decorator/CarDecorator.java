package structural.decorator;

public abstract class CarDecorator implements Car{
    protected Car c;

    public CarDecorator(Car c) {
        this.c = c;
    }
}
