package behavioral.inclass;


public class Main {
    public static void main(String[] args) {
        Character nin = new Ninja();
        System.out.println("Ninja initialized");

        nin.walk();
        nin.setAttackBehavior(new NormalAttack());
        nin.attack();

        System.out.println("Changing attack behavior in runtime...");
        nin.setAttackBehavior(new FakeAttack());
        System.out.println("Ninja attack is Fake now");
        nin.attack();
    }
}
