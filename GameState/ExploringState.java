package GameState;

import Items.Buyable;

import java.util.ArrayList;
import java.util.Scanner;

public class ExploringState implements GameState {
    @Override
    public void handle() {
        System.out.println("Exploring the map. You can move freely.");
        System.out.println("1. Explore");
        System.out.println("2. Buy stuff");
        System.out.println("3. PokemonCenter");
        System.out.println("4. Battle Wild Pokemon");
        System.out.println("5. Pause");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You continue exploring.");
                GameContext.getInstance().setState(new ExploringState());
                break;
            case 2:
                GameContext.getInstance().setState(new BuyingState());
                break;
            case 3:
                GameContext.getInstance().setState(new PokemonCenterState());
                break;
            case 4:
                GameContext.getInstance().setState(new WildPokemonBattleState());
                break;
            case 5:
                GameContext.getInstance().setState(new PauseState());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                GameContext.getInstance().setState(new ExploringState());
                break;
 }
}
}