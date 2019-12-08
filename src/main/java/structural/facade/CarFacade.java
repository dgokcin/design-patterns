package structural.facade;

public class CarFacade {

    private FuelInjector fi = new FuelInjector();
    private CatalyticConverter cc = new CatalyticConverter();
    private AirFlowController afc = new AirFlowController();
    private Ignition ig = new Ignition();

    public void runEngine() {
        //run the engine
        ig.ignite();
        fi.on();
        afc.on();
        fi.injectFuel(1);
        afc.takeAir(5);
        cc.on();
    }

    public void stopEngine() {
        //turn off the engine
        ig.off();
        fi.off();
        afc.off();
        cc.off();
    }

    public void drive() {
        System.out.println("enjoy driving, drive responsibly!");
    }
}
