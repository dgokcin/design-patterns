package behavioral.chainofresponsibility;

public abstract class AbstractLogger {
    static int INFO = 1;
    static int WARNING = 2;
    static int ERROR = 3;

    int level;

    //next element in chain or responsibility
    private AbstractLogger nextLogger;

    void setNextLogger(AbstractLogger nextLogger) {
        //run an algorithm to check if this will create a circular linkedlist
        this.nextLogger = nextLogger;
    }


    final void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        //eger levellar uyumsuzsa sonraki logger ile sans denemece
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
