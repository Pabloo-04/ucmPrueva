package GameState;

class LoadingGameState implements GameState {
    @Override
    public void handle(GameContext context) {
        context.saveLoad.load();
        context.setState(new ExploringState());
    }
}
