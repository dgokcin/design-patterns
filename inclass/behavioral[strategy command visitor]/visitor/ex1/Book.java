package behavioral.visitor.ex1;

//concrete element
public class Book implements Visitable {
    private double price = 20;
    private double weight = 30;

    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}