package GameState;

import java.util.Scanner;

import static java.lang.System.exit;

class InitialMenuState implements GameState {
    @Override
    public void handle() {
        GameContext.getInstance().player.reset();
        System.out.println("Initial Menu:");
        System.out.println("1. Create New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                GameContext.getInstance().setState(new CreatingGameState());
                break;
            case 2:
                GameContext.getInstance().setState(new LoadingState());
                break;
            case 3:
                System.out.println("Exiting the game.");
                exit(0); // Exit the game
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                GameContext.getInstance().setState(new InitialMenuState());
                break;
        }
    }
}
