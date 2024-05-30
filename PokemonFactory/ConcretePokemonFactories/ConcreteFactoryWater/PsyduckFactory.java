package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Water.Psyduck;

public class PsyduckFactory implements PokemonFactory {
    @Override
    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new Psyduck(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
