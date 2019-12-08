package behavioral.chainofresponsibility;

public class WarningLogger extends AbstractLogger {

    WarningLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("!!!! WARNING " + message + " !!!!");
    }
}
