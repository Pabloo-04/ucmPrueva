package PokemonFactory.Pokemon.Normal;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Snorlax extends Pokemon {
    public Snorlax(String name, int hp, int level, int hpMax, int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, level, hpMax, xp, speed, pokemontype,attacks);
    }

    public Snorlax() {
    }

    @Override
    public String toString() {
        return "Snorlax";
    }
}
