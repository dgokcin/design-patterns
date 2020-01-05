package structural.decorator.ex2;

public abstract class Beverage
{
    public enum Sizes
    {
	TALL, GRANDE, VENTI
    }

    private int size;
    String description = "Unknown Beverage";
    public String getDescription() {return description;}
    public abstract double cost();
}
