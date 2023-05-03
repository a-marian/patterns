package ar.com.patterns.behavioral.command;

import java.util.Random;

/**
 * Four entities associated with the command pattern: command, receiver, invoker and client.
 * * A command object encapsulates the command to execute.
 * * The receiver knows how to process the command.
 * * An invoker object knows how to execute a command on the receiver. The invoker does not know anything
 *   about a concrete command, it knows only the command interface.
 * * The client decides when and which commands to execute.
 * Both an invoker object and command object(s) are held by a client
 * */
public class CommandMain {

    public static void main(String[] args) {

        var cmd = "ON";
        if(new Random().nextInt() % 2 == 0){
            cmd = "OFF";
        }

        Light light = new Light();
        Command powerOn = new PowerOn(light);
        Command powerOff = new PowerOff(light);

        RemoteControl remoteControl = new RemoteControl();
        switch (cmd){
            case "ON" -> remoteControl.setCommand(powerOn);
            case "OFF" -> remoteControl.setCommand(powerOff);
        }
    }
}
