package behavioral.visitor.ex1;

public class DeliveryVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("delivery with car");
    }

    @Override
    public void visit(CD cd) {
        System.out.println("delivery with bike");
    }

    @Override
    public void visit(DVD dvd) {
        System.out.println("delivery with flight");
    }

    @Override
    public void visit(Bluray bluray) {
        ///
    }
}
