package structural.bridge.ex1;

@SuppressWarnings("unused")
/*
Intent:
- Decouple an abstraction from its implementation so that the two can vary independently.
Motivation:
- When an abstraction can have one of several possible implementations,
the usual way to accommodate them is to use inheritance.
- But inheritance binds an implementation to the abstraction permanently, which
makes it difficult to modify, extend, and reuse abstractions and implementations independently.

 */
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

