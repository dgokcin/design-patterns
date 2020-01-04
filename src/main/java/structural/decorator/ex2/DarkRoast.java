package structural.decorator.ex2;

public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
	description = "DarkRoast";
    }

    public double cost()
    {
	return 0.99;
    }
}
