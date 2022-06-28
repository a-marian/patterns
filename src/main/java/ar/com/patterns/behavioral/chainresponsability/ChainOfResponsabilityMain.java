package ar.com.patterns.behavioral.chainresponsability;

/**
 * Create interfance of event handler and declare mmethod of event handling.
 * MAke sure that each implementation of the chain interface may contain the reference
 *  to the next lint in the chain
 *  Each chain implementation contributes to the event handling
 *  If the request is needed to be passed forward link object calls
 *   the method on the next element in chain
 *  CLient ceates chain depending on the business logic and launches chain from the root
 *  */
public class ChainOfResponsabilityMain {

    private static Logger doChain(){
        Logger infolog = new InfoLogger(Logger.INFO);

        Logger errorlog = new ErrorLogger(Logger.ERROR);
        infolog.setNextLevelLogger(errorlog);

        Logger debuglog = new DebugLogger(Logger.DEBUG);
            errorlog.setNextLevelLogger(debuglog);

        return infolog;
    }

    public static void main(String[] args) {
            Logger chainlog = doChain();
            chainlog.logMessage(Logger.INFO,"You are log successful");
            chainlog.logMessage(Logger.ERROR, "In ternal server error");
            chainlog.logMessage(Logger.DEBUG, "Application is starting");


    }
}
