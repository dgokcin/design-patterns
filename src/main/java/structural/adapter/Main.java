package structural.adapter;

/*
Intent:
Convert the interface of a class into another interface clients expect.
Adapter lets classes work together that couldn't otherwise because of
incompatible interfaces.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("=====================");
        Car c2 = new SportsCar();
        Bicycle b2 = new MyBike();
        b2.cycle();
        c2.drive();

        Bicycle ca2 = new CarAdapter(c2);
        //car can now cycle because of the adapter pattern.
        ca2.cycle();

    }
}
/*
Use the Adapter pattern when
- You want to use an existing class, and its interface does not match the one you need.
- You want to create a reusable class that cooperates with unrelated or unforeseen classes,
that is, classes that don't necessarily have compatible interfaces.
 */
