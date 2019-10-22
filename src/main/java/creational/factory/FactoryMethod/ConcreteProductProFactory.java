package creational.factory.FactoryMethod;

public class ConcreteProductProFactory extends ProductFactory {
    @Override
    protected Product produceProduct(String type) {
        return new ConcreteProductPro();
    }
}
