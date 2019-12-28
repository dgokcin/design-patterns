package structural.bridge.ex2;

public class Ellipse extends Shape {

    public Ellipse(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Ellipse");
        color.paint();
    }
}
