package behavioral.inclass;

import behavioral.observer.WeatherData;

public interface WeaponBehavior {
    void weaponize();
}

class CanNotWeaponize implements WeaponBehavior {
    @Override
    public void weaponize() {
        System.out.println("Can not weaponize");
    }
}

class NinjaStar implements WeaponBehavior {
    @Override
    public void weaponize() {
        System.out.println("Ninja Star");

    }
}

class Axe implements WeaponBehavior {
    @Override
    public void weaponize() {
        System.out.println("Axe");

    }
}

class Gun implements WeaponBehavior {
    @Override
    public void weaponize() {
        System.out.println("Gun");

    }
}
