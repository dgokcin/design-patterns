package creational.factory.AbstractFactory.ex1;

public interface IComputerFactory {
    //getComputer is the factory it self
    Computer getComputer(String model, String cores, String memory, String disk);

    Sensor getSensor();

    HouseElectronics getHouseElectronics();

    //method delivery

}
