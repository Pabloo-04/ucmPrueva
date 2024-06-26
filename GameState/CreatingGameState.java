package GameState;

import Entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

class CreatingGameState implements GameState {
    @Override
    public void handle() {
        GameContext.getInstance().player.reset();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        Player player = GameContext.getInstance().getPlayer();
        player.setName(playerName);
        GameContext.getInstance().setPlayer(player);
        System.out.println("Welcome, " + playerName + "! Starting the game...");
        GameContext.getInstance().setState(new CinematicState());
    }
}
