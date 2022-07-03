package ar.com.patterns.behavioral.state;

public class StopGame implements State {

    @Override
    public void executeAction(Context context) {
        System.out.println("Game saved");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopGame";
    }
}
