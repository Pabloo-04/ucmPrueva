package GameStateMemento;

import Entities.Player;

public class Game {//Originator class
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
// Cambiar esto..


    /*
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
*/