package behavioral.visitor.ex1;

public interface Visitor {

    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

    void visit(Bluray bluray);
}