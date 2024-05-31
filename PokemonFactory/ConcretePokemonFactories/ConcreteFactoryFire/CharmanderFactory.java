package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Fire.Charmander;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class CharmanderFactory implements PokemonFactory {

    public Pokemon createPokemon(int hp, int xp, int speed) {
        return new Charmander("Charmander", 30, 30, 60, POKEMONTYPE.FIRE);
    }
}
