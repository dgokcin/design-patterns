package behavioral.visitor;

public class DVD implements Visitable {
    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

