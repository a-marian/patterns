package ar.com.patterns.behavioral.state;

/**Context defines an interface to client. It mantains references
 * to concrete state objects which may be used to define current state of object.*/
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
