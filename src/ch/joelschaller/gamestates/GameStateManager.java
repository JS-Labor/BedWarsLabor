//Class by Joel Schaller made at 20:29 on 31.08.2020

package ch.joelschaller.gamestates;

import ch.joelschaller.classes.Main;

public class GameStateManager {

    private GameState[] gameStates;
    private GameState currentGameState;
    private Main plugin;

    public GameStateManager(Main plugin) {
        this.plugin = plugin;

        gameStates = new GameState[3];

        gameStates[GameState.LOBBY_STATE] = new LobbyState();
        gameStates[GameState.STARTED_STATE] = new StartedState();
        gameStates[GameState.STOPPED_STATE] = new StoppedState();
    }

    public void setGameState(int gameStateID) {
        if (currentGameState != null) {
            currentGameState.stop();
        }
        currentGameState = gameStates[gameStateID];
        currentGameState.start();
    }

    public void stopCurrentGameState() {
        if (currentGameState != null) {
            currentGameState.stop();
            currentGameState = null;
        }
    }

    public GameState getCurrentGameState() {
        return currentGameState;
    }
}
