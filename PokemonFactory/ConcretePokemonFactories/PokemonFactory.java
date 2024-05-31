package PokemonFactory.ConcretePokemonFactories;

import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public interface PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed);

}
