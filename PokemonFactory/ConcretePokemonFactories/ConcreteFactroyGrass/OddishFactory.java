package PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.Scratch;
import PokemonFactory.Pokemon.Attack.VineWhip;
import PokemonFactory.Pokemon.Grass.Oddish;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class OddishFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int hpMax,int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new VineWhip());
        attacks.add(new Scratch());
        return new Oddish("Oddish",hp, hpMax, xp,speed, POKEMONTYPE.GRASS,attacks);
    }
}
