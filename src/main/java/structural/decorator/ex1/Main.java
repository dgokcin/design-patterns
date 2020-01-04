package structural.decorator.ex1;

/*
Intent
Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to sub classing for extending functionality.
 */
public class Main {

    public static void main(String[] args) {
        Car c = new StandardCar();
        c.build();
        System.out.println("------------------");

        Car sportCar = new SportCarDecorator(c);
        sportCar.build();
        System.out.println("------------------");

        Car luxuryCar = new LuxuryCarDecorator(c); // basic with luxury
        luxuryCar.build();
        System.out.println("------------------");

        Car luxurySportCar = new LuxuryCarDecorator(sportCar);
        luxurySportCar.build();
        System.out.println("------------------");

        Car luxLuxSportCar = new LuxuryCarDecorator(luxurySportCar);
        luxLuxSportCar.build();
    }
}


