package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.BodySlam;
import PokemonFactory.Pokemon.Attack.Scratch;
import PokemonFactory.Pokemon.Normal.Snorlax;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class SnorlaxFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new BodySlam());
        attacks.add(new Scratch());
        return new Snorlax("Snorlax", hp, xp, speed, POKEMONTYPE.NORMAL,attacks);
    }
}
