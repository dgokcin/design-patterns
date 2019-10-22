package behavioral.template;

public class Coffee extends Beverage{
    public void brew() {
        System.out.println("Boiling Coffee");
    }

    public void addStuff() {

        System.out.println("Adding coffeeg specific stuff");
    }
}
