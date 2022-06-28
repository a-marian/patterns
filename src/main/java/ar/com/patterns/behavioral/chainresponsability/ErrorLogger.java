package ar.com.patterns.behavioral.chainresponsability;

public class ErrorLogger extends Logger {

    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLog(String msg) {
        System.out.println("Error logger :" + msg);
    }
}
