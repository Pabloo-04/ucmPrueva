package GameStateMemento;
class Game {//Originator class
    private String playerName;
    private int playerLevel;
    private int playerHealth;
    // Cambiar esto..

    public GameStateMemento saveState() {
        return new GameStateMemento(playerName, playerLevel, playerHealth);
    }

    public void restoreState(GameStateMemento memento) {
        this.playerName = memento.getPlayerName();
        this.playerLevel = memento.getPlayerLevel();
        this.playerHealth = memento.getPlayerHealth();
        // Restore other game state attributes
    }

    // Setters and getters for game state attributes
}
