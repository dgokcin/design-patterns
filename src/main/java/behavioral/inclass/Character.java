package behavioral.inclass;

public abstract class Character {
    DefendBehavior defendBehavior;
    UltimateBehavior ultimateBehavior;
    WeaponBehavior weaponBehavior;
    AttackBehavior attackBehavior;

    public void walk() {
        System.out.println("Walking...");
    }

    public void attack() {
        attackBehavior.attack();
    }

    public void defend() {
        defendBehavior.defend();
    }

    public void useUltimate() {
        ultimateBehavior.ultimate();
    }

    public void useWeapon() {
        weaponBehavior.weaponize();
    }

    public void setAttackBehavior(AttackBehavior ab) {
        attackBehavior = ab;
    }

    public void setDefendBehavior(DefendBehavior db) {
        defendBehavior = db;
    }

    public void setUltimateBehavior(UltimateBehavior ub) {
        ultimateBehavior = ub;
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
}


class Civilian extends Character {

    Civilian() {
        attackBehavior = new CanNotAttack();
        defendBehavior = new CanNotDefend();
        ultimateBehavior = new CanNotUseUltimate();
        weaponBehavior = new CanNotWeaponize();
    }
}
class Supporter extends Character {
    Supporter() {
        attackBehavior = new CanNotAttack();
        defendBehavior = new Blockage();
        ultimateBehavior = new Finisher();
        weaponBehavior = new CanNotWeaponize();
    }
}

class Monster extends Character {
    Monster() {
        attackBehavior = new NormalAttack();
        defendBehavior = new Blockage();
        ultimateBehavior = new Finisher();
        weaponBehavior = new CanNotWeaponize();
    }
}

class Ninja extends Character {
    Ninja() {
        attackBehavior = new NormalAttack();
        defendBehavior = new Blockage();
        ultimateBehavior = new CanNotUseUltimate();
        weaponBehavior = new Axe();
    }
}
