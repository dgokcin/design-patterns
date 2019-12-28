package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DrawableShapeGroup implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();
    private String col = "black (default)";
    private int id;

    public DrawableShapeGroup(int id) {
        this.id = id;
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public void remove(Shape s) {
        shapes.remove(s);
    }

    public void clearAll() {
        System.out.println("Clear all shapes from Drawable Shape Group ID " + id);
        shapes.clear();
    }

    @Override
    public void draw(String color) {
        System.out.println("=== Drawable Shape Group ID " + id + " ===");
        if (color == null)
            color = col;

        for (Shape s : shapes) {
            s.draw(color);
        }
        System.out.println("=== Drawing ends for ID " + id + " ===");
    }

    @Override
    public void drawDifferentColor() {
        System.out.println("=== Drawable Shape Group ID " + id + " ===");
        for (Shape s : shapes) {
            s.drawDifferentColor();
        }
        System.out.println("=== Drawing ends for ID " + id + " ===");

    }

    @Override
    public void setColor(String color) {
        col = color;
    }
}

