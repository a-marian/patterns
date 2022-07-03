package ar.com.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento pattern is used to restore state of an object to a previous state.
 * The memento has two goals:
 * - Saving the important state of a system's key object.
 * Maintaining the key object's encapsulation.
 * */
public class MementoMain {

    public static void main(String[] args) {
        List<Game.Memento> savedStates = new ArrayList<Game.Memento>();

        Game game = new Game();
        game.set("Game started at level 0");
        savedStates.add(game.saveGameState());
        game.set("Gamer achieved to level 1");
        savedStates.add(game.saveGameState());
        game.set("Gamer achieved to level 2");
        savedStates.add(game.saveGameState());
        game.set("Gamer achieved to level 3 ");

        game.restoreGameState(savedStates.get(0));
    }
}
