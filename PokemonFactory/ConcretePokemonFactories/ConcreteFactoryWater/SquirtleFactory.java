package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Water.Squirtle;

public class SquirtleFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Squirtle("Squirtle", 40, 30, 50,POKEMONTYPE.WATER);
    }
}
