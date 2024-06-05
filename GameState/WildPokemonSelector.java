package GameState;

import PokemonFactory.FactoryClient;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.PokemonEnum;

import java.util.Random;

public class WildPokemonSelector {
    private static Random random = new Random();


    public static Pokemon getRandomWildPokemon() {
        int choice = random.nextInt(4);
        int level = random.nextInt((10 - 1) + 1) + 1;
        switch(choice) {
            case 0:
                return FactoryClient.getPokemon(PokemonEnum.GROWLITHE,200,level,200,30,10);
            case 1:
                return FactoryClient.getPokemon(PokemonEnum.JIGGLYPUFF, 200,level,200,30,40);
            case 2:
                return FactoryClient.getPokemon(PokemonEnum.ODDISH,200,level,200,30,23);
            case 3:
                return FactoryClient.getPokemon(PokemonEnum.PSYDUCK,200,level,200,30,15);
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}

