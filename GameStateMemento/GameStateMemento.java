package GameStateMemento;

import java.io.Serializable;

class GameStateMemento implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String playerName;
    private final int playerLevel;
    private final int playerHealth;
    // Add other game state attributes

    public GameStateMemento(String playerName, int playerLevel, int playerHealth) {
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerHealth = playerHealth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }
}