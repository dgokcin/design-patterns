package behavioral.visitor;

public class DeliveryVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("delivery with car");
    }

    @Override
    public void visit(CD cd) {
        System.out.println("delivery with bike");
    }

}
