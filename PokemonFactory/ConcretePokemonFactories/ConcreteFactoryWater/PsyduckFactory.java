package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Water.Psyduck;

public class PsyduckFactory implements PokemonFactory {
    @Override
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Psyduck("Psyduck", 50, 25, 35, POKEMONTYPE.WATER);
    }
}
