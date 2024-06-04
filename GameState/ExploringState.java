package GameState;

import Items.Buyable;

import java.util.ArrayList;
import java.util.Scanner;

class ExploringState implements GameState {
    @Override
    public void handle(GameContext context) {
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
                context.setState(new ExploringState());
                break;
            case 2:
                context.setState(new BuyingState());
                break;
            case 3:
                context.setState(new PokemonCenterState());
                break;
            case 4:
                context.setState(new WildPokemonBattleState());
                break;
            case 5:
                context.setState(new PauseState());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                context.setState(new ExploringState());
                break;
 }
}
}