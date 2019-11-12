package behavioral.visitor;

public class CD implements Visitable{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
