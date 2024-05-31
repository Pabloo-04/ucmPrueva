package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.OwlUCA;

public class OwlUCAFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new OwlUCA("OwlUCA", 150, 100, 80, POKEMONTYPE.PSYCHIC);
    }
}
