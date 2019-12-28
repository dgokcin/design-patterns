package structural.bridge.ex2;

public class Star extends Shape {
    Star(Color c) {
        super(c);
    }

    @Override
    public void paint() {
        System.out.println("Star's color");
        color.paint();
    }
}
