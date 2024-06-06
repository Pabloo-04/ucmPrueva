package GameState;

import PokemonFactory.Pokemon.Pokemon;

import java.util.Scanner;

public class PokemonCenterState implements GameState{
    @Override
    public void handle() {
        System.out.println("-----------------------------------------------");
        System.out.println("Welcome to the Pokemon Center! ");
        System.out.println("1. Cure Pokemons");
        System.out.println("2. Exit Pokemon Center");
        System.out.println("-----------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                for(Pokemon p : GameContext.getInstance().getPlayer().getPokemons()){
                    p.setHp(p.getHpMax());
                }
                System.out.println("Your Pokemons have been healed!");
                GameContext.getInstance().setState(new PokemonCenterState());
                break;
            case 2:
                GameContext.getInstance().setState(new ExploringState());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                GameContext.getInstance().setState(new PokemonCenterState());
                break;
        }

    }
}
