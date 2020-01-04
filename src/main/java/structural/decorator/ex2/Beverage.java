package structural.decorator.ex2;

public abstract class Beverage
{
    public enum Sizes
    {
	TALL, GRANDE, VENTI
    }

    private int size;

    String description = "Unknown Beverage";

    public String getDescription()
    {
	return description;
    }

    public void setSize(int size)
    {
	this.size = size;
    }

    public int getSize()
    {
	return size;
    }

    public abstract double cost();
}
