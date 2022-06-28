package ar.com.patterns.behavioral.chainresponsability;

public class InfoLogger extends Logger{

    public InfoLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLog(String msg) {
        System.out.println("Info logger :" + msg);
    }
}
