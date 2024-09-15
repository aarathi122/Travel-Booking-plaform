public class Logger1 {

    private static Logger1 instance;


    private Logger1() {

    }


    public static Logger1 getInstance() {
        if (instance == null) {

            instance = new Logger1();
        }
        return instance;
    }


    public void log(String message) {
 
        System.out.println("Logging message: " + message);
    }

    public static void main(String[] args) {

        Logger1 logger = Logger1.getInstance();


        logger.log("This is the first log message.");
        logger.log("This is the second log message.");

 
        Logger1 anotherLogger = Logger1.getInstance();
        System.out.println("Are both loggers the same instance? " + (logger == anotherLogger));
    }
}