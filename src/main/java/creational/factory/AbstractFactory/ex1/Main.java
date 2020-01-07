package creational.factory.AbstractFactory.ex1;

public class Main {

    public static void main(String[] args) {

        IComputerFactory factoryOne = null; // = new RegularComputerFactory();
        IComputerFactory factoryTwo = null; //  = new EmbeddedComputerFactory();


        //factory method taking abstract factory as input
        //Computer regCmp = ComputerFactory.getComputer(factoryOne, "Desktop Series 2019", "16", "32GB", "512GB SSD");
        //Computer embCmp = ComputerFactory.getComputer(factoryTwo, "Raspberry 3B", "4", "2GB", "8GB SSD");

        //Sensor s1 = ComputerFactory.getSensor(factoryOne);
        //Sensor s2 = ComputerFactory.getSensor(factoryTwo);

        //System.out.println("sensor 1 " + s1.toString());
        //System.out.println("sensor 2 " + s2.toString());

        //System.out.println("###########");
        //System.out.println("Regular Computer: " + regCmp.toString());
        //System.out.println("Embedded Computer: " + embCmp.toString());


        //according to some user input or my need
        factoryOne = new RegularComputerFactory();
        factoryTwo = new EmbeddedComputerFactory();

        Computer regularComputer = factoryOne.getComputer("model1", "2", "16GB", "512GB");
        Computer embeddedComputer = factoryTwo.getComputer("model2", "2", "1GB", "4GB");

        Sensor sLight = factoryTwo.getSensor();
        Sensor sProximity = factoryOne.getSensor();

        System.out.println("RegularComputer " + regularComputer.toString());
        System.out.println("EmbeddedComputer " + embeddedComputer.toString());

        System.out.println("LightSensor is " + sLight.toString());
        System.out.println("ProximitySensor is " + sProximity.toString());

        HouseElectronics ac = factoryOne.getHouseElectronics();
        HouseElectronics fridge = factoryTwo.getHouseElectronics();

        System.out.println(ac.toString());
        System.out.println(fridge.toString());

        IComputerFactory factoryThree = new HouseElectronicsFactory();
        HouseElectronics dishWasher = factoryThree.getHouseElectronics();
        System.out.println(dishWasher.toString());


        factoryThree.getSensor();
        factoryThree.getComputer("", "", "", "");


    }
}
