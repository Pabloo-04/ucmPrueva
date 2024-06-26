package GameState;

import PokemonFactory.FactoryClient;
import PokemonFactory.PokemonEnum;

import java.util.Random;
import java.util.Scanner;

public class CinematicState implements GameState {
    @Override
    public void handle() {
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
        GameContext.getInstance().setState(new ChoosingPokemonState());
    }
}




