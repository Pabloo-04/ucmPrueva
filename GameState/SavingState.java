package GameState;

public class SavingState implements GameState{
    @Override
    public void handle() {
        GameContext.getInstance().saveLoad.save();
        GameContext.getInstance().setState(new PauseState());
    }
}
