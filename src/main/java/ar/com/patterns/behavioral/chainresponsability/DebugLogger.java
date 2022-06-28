package ar.com.patterns.behavioral.chainresponsability;

public class DebugLogger extends Logger{

    public DebugLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLog(String msg) {
        System.out.println("Debbug logger :" + msg);
    }
}
