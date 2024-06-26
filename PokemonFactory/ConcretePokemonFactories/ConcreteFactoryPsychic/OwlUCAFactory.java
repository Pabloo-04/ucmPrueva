package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPsychic;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.*;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Psychic.OwlUCA;

import java.util.ArrayList;

public class OwlUCAFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int level,int hpMax,int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new QuantumCalculus());
        attacks.add(new PsyShock());
        attacks.add(new Scratch());
        return new OwlUCA("OwlUCA", hp, level,hpMax, xp, speed, POKEMONTYPE.PSYCHIC,attacks);
    }
}
