package behavioral.inclass;

public interface AttackBehavior {
    void attack();
}

class CanNotAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Can not attack");

    }
}

class SpecialAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Special Attacking");
    }
}

class NormalAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Normal Attacking");
    }
}

class FakeAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Fake Attacking");
    }
}
