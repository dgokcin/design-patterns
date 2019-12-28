package structural.bridge.ex2;

public class Main {
    public static void main(String[] args) {

        Color y = new YellowColor();
        Color b = new BlueColor();
        Color g = new GreenColor();
        Color p = new PinkColor();


        Shape triangle = new Triangle(y);
        Shape square = new Square(b);

        triangle = new Triangle(p);
        square.color = p;

        triangle.paint();
        square.paint();
        System.out.println("==========");
        Shape star = new Star(p);
        Shape star2 = new Star(g);
        star.paint();
        star2.paint();


        /*
        Shape triangle = new Triangle(y);
        Shape square = new Square(b);


        Color purp = new PurpleColor();
        triangle.color = purp;
        triangle.paint();
        square.paint();
        System.out.print(" ");


        System.out.println("========");
        Shape ell = new Ellipse(g);
        ell.paint();
*/
    }
}
