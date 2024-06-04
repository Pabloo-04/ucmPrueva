package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPsychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.BodySlam;
import PokemonFactory.Pokemon.Attack.Scratch;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.Mew;

import java.util.ArrayList;

public class MewFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int hpMax,int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new BodySlam());
        attacks.add(new Scratch());
        return new Mew("Mew", hp, hpMax,xp, speed, POKEMONTYPE.PSYCHIC,attacks);
    }
}
