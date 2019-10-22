package behavioral.nullObject;

public class Main {

    // By implementing a null object interface, and using it in the Factory
    // client does not need to handle null objects
    // the null planet class implements the planet interface(nothing is done inside)

    public static void main(String[] args) {
//        Planet p1 = PlanetFactory.getPlanet("Earth");
//        Planet p2 = PlanetFactory.getPlanet("Mars");
//        Planet p3 = PlanetFactory.getPlanet("Jupiter");
//
//        if (p1 != null) {
//            p1.printName();
//            p1.rotate();
//        }
//        if (p2 != null) {
//            p2.printName();
//            p2.rotate();
//        }
//        if (p3 != null) {
//            p3.printName();
//            p3.rotate();
//        }

        System.out.println("----------------------------------------");

        Planet p11 = GoodPlanetFactory.getPlanet("Earth");
        Planet p22 = GoodPlanetFactory.getPlanet("Mars");
        Planet p33 = GoodPlanetFactory.getPlanet("Jupiter");

        p11.printName();
        p11.rotate();
        p22.printName();
        p22.rotate();
        p33.printName();
        p33.rotate();

    }
}
