package behavioral.strategy.ex1;

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
        System.out.println("Can't fly.");
    }
}

class FlyWithRocket implements FlyBehaviour {
    public void fly() {
        System.out.println("Rocket fly...");
    }
}

class FlyWithJetPack implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Fly with JET PACK...!!!! ...!!");
    }
}

