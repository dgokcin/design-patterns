package creational.factory.AbstractFactory.ex1;

public abstract class Computer {

    public abstract String getModelInfo();

    public abstract String getMemoryInfo();

    public abstract String getCoreInfo();

    public abstract String getDiskInfo();

    public final String getProducerInfo() {
        return "Ibex Computer Corp.";
    }

    @Override
    public String toString() {
        return getModelInfo() + " " + getCoreInfo() + " " + getDiskInfo() + " " + getMemoryInfo()
                + " produced by " + getProducerInfo();
    }
}

