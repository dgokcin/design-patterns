package structural.facade;
//observe how ugly this is as compared to MainFacade
public class Main {
    public static void main(String[] args) {
        FuelInjector fi = new FuelInjector();
        CatalyticConverter cc = new CatalyticConverter();
        AirFlowController afc = new AirFlowController();
        Ignition ig = new Ignition();


        //init the engine
        afc.on();
        fi.on();
        fi.injectFuel(1);
        afc.takeAir(5);
        ig.ignite();
        System.out.println("engine is running...");

        boolean youAreNotThere = false;
        while (!youAreNotThere) {
            //run the engine
            fi.injectFuel(5);
            afc.takeAir(20);
            cc.on();
            youAreNotThere = true;
        }

        if (youAreNotThere)
            System.out.println("I arrived.");

        //shutting down the engine
        System.out.println();
        ig.off();
        fi.off();
        afc.off();
        cc.off();
    }
}

