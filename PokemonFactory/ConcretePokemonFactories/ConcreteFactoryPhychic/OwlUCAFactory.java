package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.OwlUCA;

public class OwlUCAFactory implements PokemonFactory {
    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new OwlUCA(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
