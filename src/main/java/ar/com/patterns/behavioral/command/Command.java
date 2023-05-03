package ar.com.patterns.behavioral.command;

/**
 * The command declares an interface for all commands, it is invoked through its execute() method,
 * which asks a receiver to perform an action. */
public interface Command {

    void execute();
}
