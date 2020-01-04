package structural.decorator.ex1;

public abstract class CarDecorator implements Car{
    protected Car c;

    public CarDecorator(Car c) {
        this.c = c;
    }
}
