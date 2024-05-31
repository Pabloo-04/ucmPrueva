package PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.*;
import PokemonFactory.Pokemon.Grass.Bulbasaur;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class BulbasaurFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new VineWhip());
        attacks.add(new Scratch());
        return new Bulbasaur("Bulbasaur", 45, 30, 45, POKEMONTYPE.GRASS,attacks);
    }
}