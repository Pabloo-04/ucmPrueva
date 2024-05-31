package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Normal.Jigglypuff;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class JigglypuffFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Jigglypuff("Jigglypuff", 80, 25, 20, POKEMONTYPE.NORMAL);
    }
}
