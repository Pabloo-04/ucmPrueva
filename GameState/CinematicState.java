package GameState;

import PokemonFactory.FactoryClient;
import PokemonFactory.PokemonEnum;

import java.util.Scanner;

public class CinematicState implements GameState {
    @Override
    public void handle(GameContext context) {
        String story =
                "\nNuestra aventura comienza en el primer día de clase, cuando nuestro protagonista, \n" +
                "emocionado por ingresar a la UCA, se encuentra con un accidente inesperado. \n" +
                "¡El Pokémon legendario Owluca tomó control de todo el campus y ha hipnotizado a todos los Pokemones y a los profesores! \n" +
                "Es nuestro deber detenerlo y regresar la paz a la UCA. \n" +
                "Solo un estudiante será capaz de hacerlo… \n";

        System.out.println(story);

        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        System.out.println("An NPC has has given you 100 coins (lucky you!) and offered you a Pokemon, choose one..");
        boolean validChoice = false;
        while(!validChoice) {
            System.out.println("1.Charmander\n2.Bulbasaur\n3.Squirtle");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have chosen Charmander!");
                    context.player.getPokemons().add(FactoryClient.getPokemon(PokemonEnum.CHARMANDER, 200, 200,30, 40));
                    validChoice = true;
                    break;
                case 2:
                    System.out.println("You have chosen Bulbasaur!");
                    context.player.getPokemons().add(FactoryClient.getPokemon(PokemonEnum.BULBASAUR, 200,200, 30, 40));
                    validChoice = true;
                    break;
                case 3:
                    System.out.println("You have chosen Squirtle!");
                    context.player.getPokemons().add(FactoryClient.getPokemon(PokemonEnum.SQUIRTALE, 200,200, 30, 40));
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid Pokemon!");
                    break;
            }
        }

        context.setState(new ExploringState());

    }
}




