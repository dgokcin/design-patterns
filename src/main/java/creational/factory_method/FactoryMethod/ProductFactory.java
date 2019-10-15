package creational.factory_method.FactoryMethod;

public abstract class ProductFactory {
    public void useProduct(String type){
        Product p = produceProduct(type);
        p.use();
    }

    // abstract means empty body, protected means this class and subclasses
    protected abstract Product produceProduct(String type);
}
