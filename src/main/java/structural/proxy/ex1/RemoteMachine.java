package structural.proxy.ex1;

public class RemoteMachine implements Machine {
    private int x = 0;
    private int y = 0;

    public RemoteMachine() {
        System.out.println("RemoteMachine (real) has been initialized!");
    }

    @Override
    public void configure(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("RemoteMachine (real) has been configured with x " + x + " y " + y);
    }

    @Override
    public void start() {

        if (0 < x && 0 < y)
            System.out.println("Remote Machine (real) has been started");
        else
            System.out.println("Configuration (real machine) is missing!");
    }

    @Override
    public void stop() {
        System.out.println("Remote Machine (real) has been stopped!");
        x = 0;
        y = 0;
    }
}
