package GameState;

public class QuittingState implements GameState {
    @Override
    public void handle() {
        System.out.println("Thanks for playing!");
        GameContext.getInstance().setState(new InitialMenuState());
    }
}
