package behavioral.visitor.ex1;

public class Bluray implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
