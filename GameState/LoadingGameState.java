package GameState;

public class LoadingGameState implements GameState {
    @Override
    public void handle() {
        GameContext.getInstance().saveLoad.load();
        GameContext.getInstance().setState(new ExploringState());
    }
}
