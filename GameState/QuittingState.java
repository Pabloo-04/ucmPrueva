package GameState;

public class QuittingState implements GameState {
    @Override
    public void handle(GameContext context) {
        System.out.println("Thanks for playing!");
        context.setState(new InitialMenuState());
    }
}
