package structural.decorator.ex2;

public class SteamedMilk extends CondimentDecorator
{
    private Beverage beverage;

    public SteamedMilk(Beverage beverage)
    {
	this.beverage = beverage;
    }

    public String getDescription()
    {
	return beverage.getDescription() + ", steamed Milk";
    }

    public double cost()
    {
	return 0.10 + beverage.cost();
    }
}
