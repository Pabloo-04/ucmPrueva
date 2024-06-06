package GameState;

import PokemonFactory.FactoryClient;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.PokemonEnum;

import java.util.Random;

public class WildPokemonSelector {
    private static Random random = new Random();


    public static Pokemon getRandomWildPokemon() {
        int choice = random.nextInt(4);
        int level = random.nextInt((5 - 1) + 1) + 1;
        switch(choice) {
            case 0:
                return FactoryClient.getPokemon(PokemonEnum.GROWLITHE,50 + (level - 1)*(int)( 50*0.05) ,level,50+ (level - 1)*(int)( 50*0.05),30,45 + (level - 1)*(int)( 45*0.07));
            case 1:
                return FactoryClient.getPokemon(PokemonEnum.JIGGLYPUFF, 120 + (level - 1)*(int)( 120*0.05) ,level,120 + (level - 1)*(int)( 120*0.05) ,30,35 + (level - 1)*(int)( 35*0.07) );
            case 2:
                return FactoryClient.getPokemon(PokemonEnum.ODDISH,40 + (level - 1)*(int)( 40*0.05),level,40 + (level - 1)*(int)( 40*0.05),30,35 + (level - 1)*(int)( 35*0.07));
            case 3:
                return FactoryClient.getPokemon(PokemonEnum.PSYDUCK,60 + (level - 1)*(int)( 60*0.05),level,60 + (level - 1)*(int)( 60*0.05),30,50 + (level - 1)*(int)( 50*0.07));
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}

