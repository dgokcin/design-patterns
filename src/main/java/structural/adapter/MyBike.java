package structural.adapter;

public class MyBike implements Bicycle {
    @Override
    public void cycle() {
        System.out.println("I am riding my bicycle..");
    }

    public void oop() {
        System.out.println("this is the beauty of OOP");
    }
}
