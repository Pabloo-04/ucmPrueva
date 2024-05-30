package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Fire.Growlithe;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class GrowlitheFactory implements PokemonFactory {

    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new Growlithe(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
