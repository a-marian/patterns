package ar.com.patterns.behavioral.command;

/**
 * The invoker class to trigger commands to execute */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
        pressButton();
    }
    private void pressButton(){
        command.execute();
    }
}
