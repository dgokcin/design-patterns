package structural.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================");
        Car c2 = new SportsCar();
        Bicycle b2 = new MyBike();
        b2.cycle();
        c2.drive();

        Bicycle ca2 = new CarAdapter(c2);
        System.out.println("before the assignment!!");
        b2 = ca2;
        b2.cycle();

    }
}
