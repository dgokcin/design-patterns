package behavioral.state.gumballstate;

public class LoserState implements State {

    private GumballMachine gm;

    public LoserState(GumballMachine gumballMachine) {
        gm = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("takes your money and do nothing!");
        gm.setState(gm.getNoQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("doesnt give your money back!");

    }

    @Override
    public void turnCrank() {
        System.out.println("crank is not working!");

    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill(int count) {

    }
}
