package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Fire.Charmander;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class CharmanderFactory implements PokemonFactory {

    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new Charmander(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
