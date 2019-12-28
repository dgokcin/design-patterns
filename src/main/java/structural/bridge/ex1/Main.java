package structural.bridge.ex1;

@SuppressWarnings("unused")

public class Main {

    public static void main(String[] args) {
        TV sony = new SonyTV();
        TV samsung = new SamsungTV();
        AbstractRemoteControl arcSony = new LogitechRemoteController(sony);
        AbstractRemoteControl arcSamsung = new LogitechRemoteController(samsung);
        arcSony.turnOn();
        arcSony.setChannel(5);
        arcSony.turnOff();
        System.out.println("=====");
        arcSony = new LogitechRemoteController(samsung);
        arcSony.turnOff();
    }

}

