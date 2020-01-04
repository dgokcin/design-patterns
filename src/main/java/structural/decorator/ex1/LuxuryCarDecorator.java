package structural.decorator.ex1;

public class LuxuryCarDecorator extends CarDecorator {

    public LuxuryCarDecorator(Car c) {
        super(c);
    }

    @Override
    public void build() {

        c.build();
        System.out.println("Luxury features are added!");
    }
}

