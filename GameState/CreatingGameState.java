package GameState;

import java.util.Scanner;

class CreatingGameState implements GameState {
    @Override
    public void handle(GameContext context) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        context.setPlayerName(playerName);
        System.out.println("Welcome, " + playerName + "! Starting the game...");
        context.setState(new CinematicState());
    }
}
