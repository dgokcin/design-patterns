package behavioral.strategy.ex1;

public abstract class Duck {
    FlyBehaviour flyBehaviour; //sets the flying strategy
    QuackBehaviour quackBehaviour; // sets the quacking strategy

    public void swim() {
        System.out.println("Swimming...");
    }

    public abstract void display();

    // delegate the behavior to the corresponding strategy
    public void quack() {
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}

class MallardDuck extends Duck {
    MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("Mallard display.");
    }
}

class RedHeadDuck extends Duck {
    RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("RED Head display.");
    }
}

class RubberDuck extends Duck {
    RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("Yellow rubber duck display.");
    }
}

class DecoyDuck extends Duck {
    DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Mute();
    }

    public void display() {
        System.out.println("Wooden decoy display.");
    }
}

class RobotDuck extends Duck{

    public RobotDuck() {
        flyBehaviour = new FlyWithJetPack();
        quackBehaviour = new RobotVoice();
    }

    @Override
    public void display() {

    }
}





















                          
