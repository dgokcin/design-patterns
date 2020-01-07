package creational.factory.AbstractFactory.ex1;

public abstract class Sensor {

    public abstract String getModelInfo();

    @Override
    public String toString() {
        return getModelInfo();
    }
}
