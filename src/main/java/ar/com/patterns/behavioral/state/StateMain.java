package ar.com.patterns.behavioral.state;

/**
 * State pattern is used when a object changes its behaviour based on its internal state.
 * In state pattern, we create objects which represent various states and a context object
 * whose behaviour varies as its state object changes.
 * */
public class StateMain {

    public static void main(String[] args) {
        Context context = new Context();

        StartGame startGame = new StartGame();
        startGame.executeAction(context);
        System.out.println(context.getState().toString());

        StopGame stopGame = new StopGame();
        stopGame.executeAction(context);
        System.out.println(context.getState().toString());

    }
}
