package GameState;

import PokemonFactory.FactoryClient;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.PokemonEnum;

import java.util.Random;

public class WildPokemonSelector {
    private static Random random = new Random();

    public static Pokemon getRandomWildPokemon() {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                return FactoryClient.getPokemon(PokemonEnum.SNORLAX,120,50,30);
            case 1:
                return FactoryClient.getPokemon(PokemonEnum.JIGGLYPUFF, 84,70,50);
            case 2:
                return FactoryClient.getPokemon(PokemonEnum.ODDISH,123,89,32);
            case 3:
                return FactoryClient.getPokemon(PokemonEnum.PSYDUCK,347,60,15);
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}

