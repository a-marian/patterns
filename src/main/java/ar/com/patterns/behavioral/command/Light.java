package ar.com.patterns.behavioral.command;

/**The receiver knows how to perform the work needed to carry out the request. Any class can act as receiver*/
public class Light {
    private boolean isOn;

    public void switchOn(){
        isOn = true;
        System.out.println("The light is on");
    }

    public void switchOff(){
        isOn = false;
        System.out.println("The light is off");
    }
}
