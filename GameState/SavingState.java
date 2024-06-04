package GameState;

public class SavingState implements GameState{
    @Override
    public void handle(GameContext context) {
        context.saveLoad.save();
        context.setState(new PauseState());
    }
}
