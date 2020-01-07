package creational.factory.AbstractFactory.ex1;

public class RegularComputerFactory implements IComputerFactory {

    public RegularComputerFactory() {
        System.out.println("RegularComputerFactory is created!");
    }

    @Override
    public Computer getComputer(String model, String cores, String memory, String disk) {
        return new RegularComputer("Regular " + model, cores, memory, disk);
    }

    @Override
    public Sensor getSensor() {
        return new ProximitySensor();
    }

    @Override
    public HouseElectronics getHouseElectronics() {
        return new Fridge();
    }

    /*
    @Override
    public Computer getComputer(ComputerType type, String model, String cores, String memory, String disk) {
        switch (type) {
            case DesktopComputer:
                return new DesktopComputer(model, cores, memory, disk);
            case LaptopComputer:
                return new LaptopComputer(model, cores, memory, disk);
            case IoTComputer:
                return new IoTComputer(model, cores, memory, disk);
            default:
                return null;
        }
    }
    */
}
