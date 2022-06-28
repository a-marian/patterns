package ar.com.patterns.behavioral.chainresponsability;

public abstract class Logger {

    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;
    protected int levels;

    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger){
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int level, String msg){
        if(this.levels <= level){
            displayLog(msg);
        }
        if(nextLevelLogger == null){
            nextLevelLogger.logMessage(level, msg);
        }
    }

    protected  abstract void displayLog(String msg);
}
