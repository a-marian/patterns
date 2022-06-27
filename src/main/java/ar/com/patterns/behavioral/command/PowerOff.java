package ar.com.patterns.behavioral.command;

/** One concrete command defined a binding between an action and a receiver. The invoker makes a request
 * by calling execute() and the concreteCommand carries it out by calling one or more actions on the receiver.*/
public class PowerOff implements Command {

    private Light light;

    public PowerOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
        System.out.println("Light is off");
    }
}
