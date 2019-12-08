package structural.decorator;

public class SportCarDecorator extends CarDecorator {

    public SportCarDecorator(Car c) {
        super(c);
    }

    @Override
    public void build() {
        c.build();
        System.out.println("Sport Features is added!");

    }
}

