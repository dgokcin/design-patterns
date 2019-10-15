package creational.factory_method.FactoryMethod;

public class ConcreteProduct implements Product{
    int id;

    // Constructor with id for some business need I guess...
    public ConcreteProduct(int id) {
        this.id = id;
    }

    @Override
    public void use(){

        System.out.print("I am ConcreteProduct! ");
        if (id > 0)
            System.out.print(id);
        System.out.println();

    }

}
