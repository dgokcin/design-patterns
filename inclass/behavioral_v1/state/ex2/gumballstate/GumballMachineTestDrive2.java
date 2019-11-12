package behavioral.state.ex2.gumballstate;

public class GumballMachineTestDrive2 {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.refill(5);
        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.refill(5);


    }
}
