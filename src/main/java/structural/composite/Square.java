package structural.composite;

public class Square implements Shape {
    private String col = "black (default)";

    @Override
    public void draw(String color) {
        System.out.println("Square with color " + color);
    }

    @Override
    public void drawDifferentColor() {
        System.out.println("Square with color " + col);
    }

    @Override
    public void setColor(String color) {
        col = color;
    }
}

