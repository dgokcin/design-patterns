package behavioral.state.gumballstate;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
        gumballMachine.setState(gumballMachine.getLoserState());
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill(int count) {
        System.out.println("No need to refill, machine has gumballs");

    }


    public GumballMachine getGumballMachine() {
        return gumballMachine;
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
