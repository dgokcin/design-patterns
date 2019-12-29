package behavioral.visitor;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;

    //collect data about the book
    public void visit(Book book) {
        System.out.println("Book is visited with Postage");
        totalPostageForCart += 45;
    }

    //add other visitors here
    public void visit(CD cd) {
        System.out.println("CD is visited with Postage");
        totalPostageForCart += 10;

    }

    public void visit(DVD dvd) {
        System.out.println("DVD is visited with Postage");
        totalPostageForCart += 20;

    }

//    @Override
//    public void visit(Bluray bluray) {
//
//    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}

