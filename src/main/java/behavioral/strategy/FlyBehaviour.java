package behavioral.strategy;


public interface FlyBehaviour {
    void fly();
}

class FlyWithWings implements FlyBehaviour {
    public void fly() {
        System.out.println("Flying with wings...");
    }
}

class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("Can not fly");
    }
}

class FlyWithJetPack implements FlyBehaviour {
    public void fly() {
        System.out.println("Flying with Jetpack...");
    }
}
