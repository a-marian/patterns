package ar.com.patterns.behavioral.command;

public class PowerOn implements Command {

    private Light light;

    public PowerOn(Light light) {
        this.light = light;
    }

    /** The execute method invokes the action(s) on the receiver needed to fulfill the request */
    @Override
    public void execute() {
        light.switchOn();
        System.out.println("Light is on");
    }
}
