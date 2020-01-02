package structural.flyweight;

/*
Intent:
- Use sharing to support large numbers of fine-grained objects efficiently.

Motivation:
- Some applications could benefit from using objects throughout their design,
but a naive implementation would be prohibitively expensive.

 */
public class Main {

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        System.out.println("Number of shapes: " + ShapeFactory.numberOfShapes());
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
