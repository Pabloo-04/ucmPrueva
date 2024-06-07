package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPsychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.*;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.Mew;

import java.util.ArrayList;

public class MewFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int level,int hpMax,int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new Psychic());
        attacks.add(new PsyShock());
        attacks.add(new Scratch());
        return new Mew("Mew", hp, level,hpMax,xp, speed, POKEMONTYPE.PSYCHIC,attacks);
    }
}
