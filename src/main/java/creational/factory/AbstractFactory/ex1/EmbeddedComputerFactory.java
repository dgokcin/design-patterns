package creational.factory.AbstractFactory.ex1;

public class EmbeddedComputerFactory implements IComputerFactory {

    public EmbeddedComputerFactory() {
        System.out.println("EmbeddedComputerFactory is created!");
    }

    @Override
    public Computer getComputer(String model, String cores, String memory, String disk) {
        return new EmbeddedComputer("Embedded " + model, cores, memory, disk);
    }

    @Override
    public Sensor getSensor() {
        return new LightSensor();
    }

    @Override
    public HouseElectronics getHouseElectronics() {
        return new Fridge();
    }

}
