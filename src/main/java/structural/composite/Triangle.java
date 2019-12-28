package structural.composite;

public class Triangle implements Shape {

    private String col = "black (default)";

    @Override
    public void draw(String color) {
        System.out.println("Triangle with color " + color);
    }

    @Override
    public void drawDifferentColor() {
        System.out.println("Triangle with color " + col);
    }

    @Override
    public void setColor(String color) {
        col = color;
    }
}

