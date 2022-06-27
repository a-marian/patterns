package ar.com.patterns.behavioral.command;

/**Command declares an interface for all commandos. As you already know a command is invoked through its execute()
 * method, which asks a receiver to perform an action. */
public interface Command {

    void execute();
}
