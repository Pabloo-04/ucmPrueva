package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Normal.Jigglypuff;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class JigglypuffFactory implements PokemonFactory {
    public Pokemon createPokemon(String nombre, int hp, int xp, int speed, POKEMONTYPE pokeType, String attackName, int damage) {
        return new Jigglypuff(nombre, hp, xp, speed, pokeType, attackName, damage);
    }
}
