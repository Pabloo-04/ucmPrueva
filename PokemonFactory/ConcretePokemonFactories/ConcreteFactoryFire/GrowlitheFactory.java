package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Fire.Growlithe;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class GrowlitheFactory implements PokemonFactory {

    public Pokemon createPokemon( int hp, int xp, int speed) {
        return new Growlithe("Growlithe", 50, 25, 45, POKEMONTYPE.FIRE);
    }
}
