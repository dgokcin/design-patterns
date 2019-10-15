package creational.factory_method.FactoryMethod;
// Bu paketi client yaziyor
public class ConcreteProductFactory extends ProductFactory{
    int id;

    @Override
    protected Product produceProduct(String type) {
        if (type == "1")
            return new ConcreteProduct(id);
        else
            return new ConcreteProductLite();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
