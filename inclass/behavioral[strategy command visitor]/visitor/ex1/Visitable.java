package behavioral.visitor.ex1;

//Element interface
public interface Visitable {
    void accept(Visitor visitor);
}