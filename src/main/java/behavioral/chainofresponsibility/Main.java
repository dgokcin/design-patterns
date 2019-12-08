package behavioral.chainofresponsibility;

//intent -> avoid coupling the sender of a request to its receiver by giving
// more than one object a chance to handle the request. Chain the receiving
//objects and pass the request along the chain until an object handles it.

//tehlikeli bir pattern bence o kadar sevmedim.
public class Main {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // 3
        AbstractLogger warningLogger = new WarningLogger(AbstractLogger.WARNING); // 2
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO); // 1

        // building my chain of resp.
        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println("----------------------------------");

        loggerChain.logMessage(AbstractLogger.WARNING,
                "This is an warning level information.");
        System.out.println("----------------------------------");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
        System.out.println("----------------------------------");
    }
}

