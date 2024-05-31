package GameState;

public class SavingState implements GameState{
    @Override
    public void handle(GameContext context) {
        System.out.println("You´ve saved the game");
        context.setState(new PauseState());
    }
}
