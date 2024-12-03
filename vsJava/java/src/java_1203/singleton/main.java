package java_1203.singleton;

public class main {
    public static void main(String[] args) {
        SingletoneLogger logger = SingletoneLogger.getInstance();
        logger.log("This is a log message ");

        SingletoneLogger anotherLogger = SingletoneLogger.getInstance();
        anotherLogger.log("This is a log message 22222");

        if(logger == anotherLogger){
            System.out.println("Both logger instances are the same");
        }
    }
}
