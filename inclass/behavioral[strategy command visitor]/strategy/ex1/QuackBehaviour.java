package behavioral.strategy.ex1;

public interface QuackBehaviour {
    void quack();
}

class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Vak vak.");
    }
}

class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak...");
    }
}

class Mute implements QuackBehaviour {
    public void quack() {
        System.out.println("----");
    }
}

class RobotVoice implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("I'm a ROBOT DUCK...");
    }
}

