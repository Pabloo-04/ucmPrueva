package PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Grass.Bulbasaur;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class BulbasaurFactory implements PokemonFactory {
    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new Bulbasaur(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
