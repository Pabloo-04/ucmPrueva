package PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Grass.Oddish;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class OddishFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Oddish("Oddish",45, 25, 30, POKEMONTYPE.GRASS);
    }
}
