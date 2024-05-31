package GameState;

import java.util.Scanner;

public class PauseState implements GameState{
    @Override
    public void handle(GameContext context) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've paused the game");
        System.out.println("1. Bag");
        System.out.println("2. Return to the game");
        System.out.println("3. Save game" );
        System.out.println("4. Quit game");


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                context.setState(new InventoryState());
                break;

            case 2:
                context.setState(new ExploringState());
                break;

            case 3:
                context.setState(new SavingState());
                break;

            case 4:
                context.setState(new QuittingState());
                break;
        }
    }
}
