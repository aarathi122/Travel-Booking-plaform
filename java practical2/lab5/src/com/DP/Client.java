package com.DP;

public class Client {
    public static void main(String[] args) {
        // Create the handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create the logger and log commands
        Logger logger = new Logger();

        // Add LogCommand with the first handler in the chain (infoHandler)
        logger.addCommand(new LogCommand(infoHandler));

        // Process log messages of different levels
        logger.processCommands("System started", LogLevel.INFO);
        logger.processCommands("Debugging connection issue", LogLevel.DEBUG);
        logger.processCommands("Null pointer exception occurred", LogLevel.ERROR);
    }
}
