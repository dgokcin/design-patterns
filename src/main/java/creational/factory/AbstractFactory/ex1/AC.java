package creational.factory.AbstractFactory.ex1;

public class AC extends HouseElectronics {
    @Override
    public String getModelInfo() {
        return "my AC";
    }

    @Override
    public String toString() {
        return "AC";
    }
}
