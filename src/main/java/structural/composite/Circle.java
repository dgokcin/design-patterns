package structural.composite;

public class Circle implements Shape {
    private String col = "black (default)";

    @Override
    public void draw(String color) {
        System.out.println("Circle with color " + color);
    }

    @Override
    public void drawDifferentColor() {
        System.out.println("Circle with color " + col);
    }

    @Override
    public void setColor(String color) {
        col = color;
    }
}

