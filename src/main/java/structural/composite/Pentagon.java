package structural.composite;

public class Pentagon implements Shape {

    private String col = "black (default)";

    @Override
    public void draw(String color) {
        System.out.println("Pentagon with color " + color);
    }

    @Override
    public void drawDifferentColor() {
        System.out.println("Pentagon with color " + col);
    }

    @Override
    public void setColor(String color) {
        col = color;
    }
}

