class LoadingGameState implements GameState {
    @Override
    public void handle(GameContext context) {
        System.out.println("Loading game...");
        // Load game logic here
        context.setState(new ExploringState());
    }
}
