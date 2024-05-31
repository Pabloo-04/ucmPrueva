package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.BodySlam;
import PokemonFactory.Pokemon.Attack.FlameThrower;
import PokemonFactory.Pokemon.Attack.Scratch;
import PokemonFactory.Pokemon.Fire.Charmander;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class CharmanderFactory implements PokemonFactory {

    public Pokemon createPokemon(int hp, int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new FlameThrower());
        attacks.add(new Scratch());
        return new Charmander("Charmander", hp, xp, speed, POKEMONTYPE.FIRE,attacks);
    }
}
