package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.Mew;

public class MewFactory implements PokemonFactory {
    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new Mew(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
