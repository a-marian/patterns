package ar.com.patterns.behavioral.state;

public class StartGame implements State {

    @Override
    public void executeAction(Context context) {
    System.out.println("Game started");
    context.setState(this);
    }

    @Override
    public String toString() {
        return "StartGame";
    }
}
