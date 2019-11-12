package behavioral.state.ex2.gumballstate.states;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill(int count);
}
