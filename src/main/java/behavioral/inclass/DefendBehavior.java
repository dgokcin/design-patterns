package behavioral.inclass;

public interface DefendBehavior {
    void defend();
}

class CanNotDefend implements DefendBehavior {
    @Override
    public void defend() {
        System.out.println("Can not defend");
    }
}

class Shield implements DefendBehavior {
    @Override
    public void defend() {
        System.out.println("Defending with shield");

    }
}

class Blockage implements DefendBehavior {
    @Override
    public void defend() {
        System.out.println("Defending with Blockage");
    }
}
