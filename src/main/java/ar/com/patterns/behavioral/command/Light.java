package ar.com.patterns.behavioral.command;

/**The receiver knows how to perform the work needed to carry out the request. Any class can act as receiver*/
public class Light {
    private boolean isOn;

    public void switchOn(){
        isOn = true;
    }

    public void switchOff(){
        isOn = false;
    }
}
