package structural.bridge.ex1;

//We want to hide the implementation of an abstraction completely from clients.

public abstract class AbstractRemoteControl {
    private TV tv; //telezivyona referans

    public AbstractRemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.switchChannel(channel);
    }

}
