package creational.factory.AbstractFactory.ex1;

public class HouseElectronicsFactory implements IComputerFactory {
    @Override
    public Computer getComputer(String model, String cores, String memory, String disk) {
        return null;
    }

    @Override
    public Sensor getSensor() {
        return null;
    }

    @Override
    public HouseElectronics getHouseElectronics() {
        return new DishWasher();
    }


}
