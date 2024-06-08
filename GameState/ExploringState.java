package GameState;

import Entities.Entity;
import PokemonFactory.Pokemon.Pokemon;
import java.util.Scanner;

public class ExploringState implements GameState {
    @Override
    public void handle() {
        displayOptions();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                explore();
                break;
            case 2:
                buyStuff();
                break;
            case 3:
                visitPokemonCenter();
                break;
            case 4:
                battleWildPokemon();
                break;
            case 5:
                battleTrainer();
                break;
            case 6:
                battleMysteriousTrainer();
                break;
            case 7:
                pauseGame();
                break;
            default:
                invalidChoice();
                break;
        }
    }

    private void displayOptions() {
        System.out.println("Exploring the map. You can move freely.");
        System.out.println("1. Explore");
        System.out.println("2. Buy stuff");
        System.out.println("3. PokemonCenter");
        System.out.println("4. Battle Wild Pokemon");
        System.out.println("5. Battle Trainer");
        System.out.println("6. Battle Mysterious Trainer");
        System.out.println("7. Pause");
    }

    private void explore() {
        System.out.println("You continue exploring.");
        GameContext.getInstance().setState(new ExploringState());
    }

    private void buyStuff() {
        GameContext.getInstance().setState(new BuyingState());
    }

    private void visitPokemonCenter() {
        GameContext.getInstance().setState(new PokemonCenterState());
    }

    private void battleWildPokemon() {
        GameContext.getInstance().setState(new WildPokemonBattleState2());
    }

    private void battleTrainer() {
        GameContext context = GameContext.getInstance();
        context.checkLevel();
        System.out.println(GameContext.getInstance().Gamelevel);
        int gameLevel = context.getGamelevel();
        if (gameLevel == 2) {

            context.setState(new BattleTrainerState(new Entity("Manolo", BattleTrainerState.createTrainerPokemons(1), 0, 0)));
        } else if (gameLevel == 3) {
            System.out.println("Manolo went crying out of campus :(");
            context.setState(new ExploringState());
        } else {
            System.out.println("You are not ready to battle me!");
            context.setState(new ExploringState());
        }
    }

    private void battleMysteriousTrainer() {
        GameContext context = GameContext.getInstance();
        context.checkLevel();
        int gameLevel = context.getGamelevel();

        if (gameLevel == 3) {
            context.setState(new BattleTrainerState(new Entity("MichaelJackson", BattleTrainerState.createTrainerPokemons(2), 0, 0)));
        } else if (gameLevel > 3) {
            System.out.println("There's no bad Pokemons anymore");
            context.setState(new ExploringState());
        } else {
            System.out.println("There's nothing here...");
            context.setState(new ExploringState());
        }
    }

    private void pauseGame() {
        GameContext.getInstance().setState(new PauseState());
    }

    private void invalidChoice() {
        System.out.println("Invalid choice, please try again.");
        GameContext.getInstance().setState(new ExploringState());
    }
}
