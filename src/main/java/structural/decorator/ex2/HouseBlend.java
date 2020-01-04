package structural.decorator.ex2;

public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
	description = "House Blend";
    }

    public double cost()
    {
	return 0.89;
    }
}
