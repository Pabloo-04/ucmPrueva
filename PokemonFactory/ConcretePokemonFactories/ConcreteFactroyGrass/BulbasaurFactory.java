package PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Grass.Bulbasaur;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class BulbasaurFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Bulbasaur("Bulbasaur", 45, 30, 45, POKEMONTYPE.GRASS);
    }
}
