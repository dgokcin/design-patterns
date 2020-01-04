package structural.decorator.ex2;

public class Soy extends CondimentDecorator
{
    private Beverage beverage;

    public Soy(Beverage beverage)
    {
	this.beverage = beverage;
    }

    public String getDescription()
    {
	return beverage.getDescription() + ", Soy";
    }

    public double cost()
    {
	return 0.15 + beverage.cost();
    }
}
