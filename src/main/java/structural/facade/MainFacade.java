package structural.facade;

/*
Intent: Provide a unified interface to a set of interfaces in a subsystem.
Define a higher-level interface that makes the subsystem easier to use.
 */
public class MainFacade {

    public static void main(String[] args) {

        CarFacade cf = new CarFacade();
        cf.runEngine();
        System.out.println();
        cf.drive();
        System.out.println();
        cf.stopEngine();
    }
}
/*
Use the Facade pattern when
- You want to provide a simple interface to a complex subsystem.
only clients needing more customizability will need to look beyond the façade.
- There are many dependencies between clients and the implementation classes of an abstraction.
Introduce a facade to decouple the subsystem from clients and other subsystems
- You want to layer your subsystems. Use a facade to define an entry point to each subsystem
level. If subsystems are dependent, make them communicate with each other solely through their facades.
 */
