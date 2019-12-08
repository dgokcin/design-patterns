package structural.adapter;

//Car and Bicycle are different interfaces.
//With a CarAdapter class implementing the bicycle interface,
//I can drive...
//this is good for since you are not adding/removing stuff from
//the existing interfaces which mighr be dangerous.
//You are making them compatible by creating a new class and overwriting.
public class CarAdapter implements Bicycle{

    private Car c;

    public CarAdapter(Car c) {
        this.c = c;
    }

    @Override
    public void cycle() {
        c.drive();
    }
}
