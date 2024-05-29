package GameState;

import java.util.Scanner;

class InitialMenuState implements GameState {
    @Override
    public void handle(GameContext context) {
        System.out.println("Initial Menu:");
        System.out.println("1. Create New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setState(new CreatingGameState());
                break;
            case 2:
                context.setState(new LoadingGameState());
                break;
            case 3:
                context.setState(null); // Exit the game
                System.out.println("Exiting the game.");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                context.setState(new InitialMenuState());
                break;
        }
    }
}
