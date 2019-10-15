package creational.factory_method.SimpleFactory;

public class MainSimpleFactory {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape s1 = sf.getShape(ShapeFactory.ShapeType.CIRCLE);
        s1.draw();

        Shape s2 = sf.getShape(ShapeFactory.ShapeType.RECTANGLE);
        s2.draw();

        Shape s3 = sf.getShape(ShapeFactory.ShapeType.SQUARE);
        s3.draw();

        Shape s4 = sf.getShape(ShapeFactory.ShapeType.UNDEFINED);
        s4.draw();
    }
}
