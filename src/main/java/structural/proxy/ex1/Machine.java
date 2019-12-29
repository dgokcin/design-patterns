package structural.proxy.ex1;

//both proxy and the real machine will implement this interface.
public interface Machine {
    void configure(int x, int y);
    void start();
    void stop();
}
