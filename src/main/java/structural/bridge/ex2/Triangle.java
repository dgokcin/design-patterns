package structural.bridge.ex2;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Triangle color ");
        color.paint();
    }
}
