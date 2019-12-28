package structural.bridge.ex1;

public class SamsungTV implements TV{
    @Override
    public void on() {
        System.out.println("SamsungTV TV is on");
    }

    @Override
    public void off() {
        System.out.println("SamsungTV TV is off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("SamsungTV: channel - " + channel);
    }

}
