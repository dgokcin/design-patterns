package structural.proxy.ex1;

//motivation: defer the full cost of creating and initializing an object until we actually need it.


public class RemoteMachineProxy implements Machine {
    private RemoteMachine rm;
    private int cacheX, cacheY;

    public RemoteMachineProxy() {
        System.out.println("RemoteMachine (proxy) has been initialized!");
    }

    @Override
    public void configure(int x, int y) {
        // we may control accessing the resource or cache its simple parameters until real operation will begin (real ops: start()
        if (x < 0 || y < 0)
            System.out.println("RemoteMachine (proxy) Invalid Configuration");
        cacheX = x;
        cacheY = y;
        System.out.println("RemoteMachine (proxy) is configured x " + cacheX + " y " + cacheY);
    }

    @Override
    public void start() {
        //proxy often handles the instantiation of the real object
        rm = new RemoteMachine();  // remote object access is deferred until its real op is called.
        rm.configure(cacheX, cacheY);
        rm.start();
    }

    @Override
    public void stop() {
        if (rm != null)
            rm.stop();
    }

    public int getCacheX() {
        return cacheX;
    }

    public int getCacheY() {
        return cacheY;
    }

}
