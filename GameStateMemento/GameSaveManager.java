package GameStateMemento;

import java.io.IOException;

public class GameSaveManager {
    private final SerializationStrategy strategy;

    public GameSaveManager(SerializationStrategy strategy) {
        this.strategy = strategy;
    }

    public void saveGame(Game game, String filename) {
        GameStateMemento memento = game.saveState();
        try {
            strategy.serialize(memento, filename);
            System.out.println("Game saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving game: " + e.getMessage());
        }
    }

    public void loadGame(Game game, String filename) {
        try {
            GameStateMemento memento = strategy.deserialize(filename);
            game.restoreState(memento);
            System.out.println("Game loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading game: " + e.getMessage());
        }
    }

   /* public static void main(String[] args) {
        Game game = new Game();
       // game.setPlayerName("Ash");
        //game.setPlayerLevel(5);
        game.setPlayerHealth(100);

        SerializationStrategy strategy = new JsonSerializationStrategy(); // or new BinarySerializationStrategy()
        GameSaveManager saveManager = new GameSaveManager(strategy);

        // Save the game
        saveManager.saveGame(game, "savegame.json");

        // Load the game
        game.setPlayerName("TempName"); // Changing the state to demonstrate loading
        saveManager.loadGame(game, "savegame.json");

        System.out.println("Player Name: " + game.getPlayerName());
    }*/


}
