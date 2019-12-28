package structural.composite;

//We want to represent part-whole hierarchies of objects
//We want clients to be able to ignore the difference between compositions of objects and individual objects.
public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape circle = new Circle();

        circle.draw("Brown");
        System.out.println("--------");

        triangle.setColor("Mavi");
        square.setColor("Siyah");
        circle.setColor("Turuncu");

        DrawableShapeGroup dsg = new DrawableShapeGroup(1);
        dsg.add(triangle);
        dsg.add(square);
        dsg.add(circle);
        dsg.drawDifferentColor();
        System.out.println("--------");

        dsg.setColor("Yellow");
        dsg.draw(null);
        System.out.println("============");

        DrawableShapeGroup dsg2 = new DrawableShapeGroup(2);

        dsg2.add(new Square());
        dsg2.add(new Triangle());
        dsg2.add(dsg); // existing drawableshapegroup object dsg

        //new shape
        Pentagon p = new Pentagon();
        p.setColor("Purple");

        dsg2.add(p);

        dsg2.add(new Triangle());

        dsg2.draw("Blue");
        System.out.println("============");
        System.out.println(" ");

        dsg2.drawDifferentColor();
        System.out.println("============");


    }
}
