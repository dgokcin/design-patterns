package creational.factory.AbstractFactory.ex1;

public class EmbeddedComputer extends Computer {

    private String memory;
    private String model;
    private String cores;
    private String disk;

    public EmbeddedComputer(String memory, String model, String cores, String disk) {
        this.memory = memory;
        this.model = model;
        this.cores = cores;
        this.disk = disk;
    }

    @Override
    public String getModelInfo() {
        return model;
    }

    @Override
    public String getMemoryInfo() {
        return memory;
    }

    @Override
    public String getCoreInfo() {
        return cores;
    }

    @Override
    public String getDiskInfo() {
        return disk;
    }
}
