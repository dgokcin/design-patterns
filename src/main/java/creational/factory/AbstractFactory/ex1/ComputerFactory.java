package creational.factory.AbstractFactory.ex1;

public class ComputerFactory {

    public static Computer getComputer(IComputerFactory factory, String model, String cores, String memory, String disk) {
        return factory.getComputer(model, cores, memory, disk);
    }

    public static Sensor getSensor(IComputerFactory factory) {
        return factory.getSensor();
    }

    public static HouseElectronics getHauseElectronics(IComputerFactory factory) {
        return factory.getHouseElectronics();
    }
}
