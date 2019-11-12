package behavioral.strategy.ex1;

public class SimUDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedHeadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        System.out.println("Mallard");
        mallard.fly();
        mallard.quack();
        System.out.println();

        System.out.println("RedHead");
        redHead.fly();
        redHead.quack();
        System.out.println();

        System.out.println("Rubber");
        rubber.fly();
        rubber.quack();
        System.out.println();

        System.out.println("Decoy");
        decoy.fly();
        decoy.quack();
        System.out.println();

        System.out.println("----------------------------");
        System.out.println("Rubber");
        rubber.setFlyBehaviour(new FlyWithWings());
        rubber.fly();
        System.out.println();

        System.out.println("Mallard");
        mallard.setQuackBehaviour(new Mute());
        mallard.quack();
        System.out.println();

        System.out.println("Rubber");
        rubber.setFlyBehaviour(new FlyWithRocket());
        rubber.fly();
        System.out.println();

        System.out.println("---------------------------------");

        Duck robotDuck = new RobotDuck();
        robotDuck.fly();
        robotDuck.quack();
        System.out.println("changing the way of flying...");
        robotDuck.setFlyBehaviour(new FlyNoWay());
        robotDuck.fly();

        System.out.println("=================================");

    }
}
