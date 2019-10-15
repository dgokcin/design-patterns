package creational.factory_method.SimpleFactory;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType){
        if (shapeType.equals(ShapeType.CIRCLE))
            return new Circle();

        else if (shapeType.equals(ShapeType.SQUARE))
            return new Square();

        else if (shapeType.equals(ShapeType.RECTANGLE))
            return new Rectangle();

        else
            return () -> System.out.println("Undefined Shape!");
    }

    public enum ShapeType {CIRCLE, SQUARE, RECTANGLE, UNDEFINED}
}
