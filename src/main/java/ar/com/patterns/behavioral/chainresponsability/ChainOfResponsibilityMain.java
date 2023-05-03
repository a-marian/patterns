package ar.com.patterns.behavioral.chainresponsability;

import static ar.com.patterns.behavioral.chainresponsability.Logger.*;

/**
 * The chain-of-responsibility pattern is structurally nearly identical to the decorator pattern,
 * the difference being that for the decorator, all classes handle the request, while for the chain of responsibility,
 * exactly one of the classes in the chain handles the request.
 * This is a strict definition of the Responsibility concept in the GoF book.
 *  */
public class ChainOfResponsibilityMain {


    public static void main(String[] args) {
        // Build an immutable chain of responsibility
        Logger logger = consoleLogger(LogLevel.all())
                .setNextLevelLogger(emailLogger(LogLevel.FUNCTIONAL_ERROR, LogLevel.FUNCTIONAL_ERROR))
                .setNextLevelLogger(fileLogger(LogLevel.WARNING, LogLevel.ERROR));

        // Handled by consoleLogger since the console has a LogLevel of all
        logger.displayLog("Entering function ProcessOrder().", LogLevel.DEBUG);
        logger.displayLog("Order record retrieved.", LogLevel.INFO);

        // Handled by consoleLogger and emailLogger since emailLogger implements Functional_Error & Functional_Message
        logger.displayLog("Unable to Process Order ORD1 Dated D1 For Customer C1.", LogLevel.FUNCTIONAL_ERROR);
        logger.displayLog("Order Dispatched.", LogLevel.FUNCTIONAL_MESSAGE);

        // Handled by consoleLogger and fileLogger since fileLogger implements Warning & Error
        logger.displayLog("Customer Address details missing in Branch DataBase.", LogLevel.WARNING);
        logger.displayLog("Customer Address details missing in Organization DataBase.", LogLevel.ERROR);
    }

}
