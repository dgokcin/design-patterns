package behavioral.strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim() {
        //The common stuff for all ducks goes here
        System.out.println("Swimming...");
    }

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
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("RED Head display.");
    }
}

class RubberDuck extends Duck {
    RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new AnnoyingQuack();
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


