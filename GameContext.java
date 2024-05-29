class GameContext {
    private GameState state;
    private String playerName;

    public GameContext() {
        this.state = new InitialMenuState();
    }

    public void setState(GameState state) {
        this.state = state;
        if (state != null) {
            state.handle(this);
        }
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void start() {
        while (state != null) {
            state.handle(this);
        }
    }

    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.start();
    }
}
