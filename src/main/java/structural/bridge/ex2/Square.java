package structural.bridge.ex2;

public class Square extends Shape {
    public Square(Color c) {
        super(c);
    }

    @Override
    public void paint() {
        System.out.println("Square's color");
        color.paint();
    }
}
