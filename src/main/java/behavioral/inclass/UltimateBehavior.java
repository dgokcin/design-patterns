package behavioral.inclass;

public interface UltimateBehavior {
    void ultimate();
}

class CanNotUseUltimate implements UltimateBehavior {
    @Override
    public void ultimate() {
        System.out.println("Can not use ultimate");
    }
}

class Finisher implements UltimateBehavior {
    @Override
    public void ultimate() {
        System.out.println("Using Finisher");

    }
}

class Damager implements UltimateBehavior {
    @Override
    public void ultimate() {
        System.out.println("Using Damager");

    }
}
