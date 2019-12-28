package structural.proxy;

public class Main {
    public static void main(String[] args) {

        Machine rmp = new RemoteMachineProxy();
        rmp.configure(5, 3);

        System.out.println("x " + ((RemoteMachineProxy) rmp).getCacheX() + " y " + ((RemoteMachineProxy) rmp).getCacheY());

        System.out.println("RemoteMachine real op is not called yet, so RemoteMachine is not initialized, conf parameters are cached only. ");
        System.out.println("Proxy servers for access control and lazy instantiation");

        rmp.start();
        rmp.stop();

    }
}

