package behavioral.template;

abstract class Beverage {
    public final void prepareRecipe() {

        boilWater();
        brew();
        addStuff();

    }

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    abstract void brew();
    abstract void addStuff();

}
