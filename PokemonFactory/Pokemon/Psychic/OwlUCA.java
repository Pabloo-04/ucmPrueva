package PokemonFactory.Pokemon.Psychic;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class OwlUCA extends Pokemon {

    public OwlUCA(String name, int hp, int level, int hpMax,int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, level, hpMax, xp, speed, pokemontype,attacks);
    }

    public OwlUCA() {
    }

    @Override
    public String toString() {
        return "OwlUCA";
    }

}
