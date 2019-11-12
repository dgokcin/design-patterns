package behavioral.state.ex2.gumballstatewinner;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill(int count);
}
