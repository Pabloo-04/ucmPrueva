package GameState;

import Items.Pokeball;
import Items.Potion;
import PokemonFactory.Pokemon.Pokemon;

import java.util.Scanner;

public class PokemonCenterState implements GameState{
    @Override
    public void handle(GameContext context) {
        System.out.println("-----------------------------------------------");
        System.out.println("Welcome to the Pokemon Center! ");
        System.out.println("1. Cure Pokemons");
        System.out.println("2. Exit Pokemon Center");
        System.out.println("-----------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                for(Pokemon p : context.getPlayer().getPokemons()){
                    p.setHp(p.getHpMax());
                }
                System.out.println("Your Pokemos have been healed!");
                break;
            case 2:
                context.setState(new ExploringState());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                context.setState(new PokemonCenterState());
                break;
        }

    }
}
