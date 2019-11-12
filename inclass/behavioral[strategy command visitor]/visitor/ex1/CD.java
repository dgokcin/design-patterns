package behavioral.visitor.ex1;

public class CD implements Visitable {
    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
