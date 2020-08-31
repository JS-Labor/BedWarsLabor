//Class by Joel Schaller made at 20:23 on 31.08.2020

package ch.joelschaller.gamestates;

public abstract class GameState {

    public static final int LOBBY_STATE = 0,
                            STARTED_STATE = 1,
                            STOPPED_STATE = 2;

    public abstract void start();
    public abstract void stop();
}
