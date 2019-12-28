package structural.flyweight;

import java.util.HashMap;

//this is where the flyweight magic happens.
//you keep the created objects in a hashmap and re-use them
//so you dont end up with 20 objects.

class ShapeFactory {
    // HashMap is one implementation of the Map interface.
    // HashMap are efficient for locating a value based on a key
    // and inserting and deleting values based on a key
    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    static Shape getCircle(String color) {
        Shape circle = shapeMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    public static int numberOfShapes(){
        return shapeMap.size();
    }
}

