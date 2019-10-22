package behavioral.nullObject;

public class GoodPlanetFactory {
    public static Planet getPlanet(String name) {

        if("Earth".equalsIgnoreCase(name)) {

            return new Earth();
        }

        else if("Mars".equalsIgnoreCase(name)) {

            return new Mars();
        }

        else return new NullPlanet();
    }
}
