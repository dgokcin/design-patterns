package behavioral.strategy;

public interface QuackBehaviour {
    void quack();
}

class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quack Quack");

    }
}

class AnnoyingQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quaiaaaaaaaaiiickst Quaiaaaaaaaaiiickst");
    }

}

class Mute implements QuackBehaviour {
    public void quack() {
        System.out.println("ZZZzzzZzZzzZZZZzzzz");
    }
}
