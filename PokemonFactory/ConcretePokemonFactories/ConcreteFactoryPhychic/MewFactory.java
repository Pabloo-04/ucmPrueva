package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.Mew;

public class MewFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Mew("Mew", 100, 100, 100, POKEMONTYPE.PSYCHIC);
    }
}
