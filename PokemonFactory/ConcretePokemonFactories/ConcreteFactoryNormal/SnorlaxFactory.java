package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Normal.Snorlax;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class SnorlaxFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Snorlax("Snorlax", 120, 50, 10, POKEMONTYPE.NORMAL);
    }
}
