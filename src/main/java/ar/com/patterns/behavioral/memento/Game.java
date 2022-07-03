package ar.com.patterns.behavioral.memento;

public class Game {

    private String state;

    public void set(String state){
        System.out.println("Setting game state to " + state);
        this.state = state;
    }

    public Memento saveGameState(){
        System.out.println("Saving game state to Memento");
        return new Memento(state);
    }

    public void restoreGameState(Memento memento){
        state = memento.getSavedTime();
        System.out.print("GAme state restored from Memento" + state);
    }

    /** Memento uses:
     * Keeping the saved state external from the key object helps to mantain cohesion.
     * Keeps the key object's data encapsulated.
     * Provides easy-to-implement recovery capability.
     * A drawback to using MEmento is that saving and restoring state con be time consuming.
     **/
    public static class Memento{

        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }

        public String getSavedTime(){
            return state;
        }
    }
}
