package GameState;

public class SavingState implements GameState{
    @Override
    public void handle() {
        GameContext.getInstance().save.save();
        GameContext.getInstance().setState(new PauseState());
    }
}
