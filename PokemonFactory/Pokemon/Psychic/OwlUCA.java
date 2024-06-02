package PokemonFactory.Pokemon.Psychic;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class OwlUCA extends Pokemon {

    public OwlUCA(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, xp, speed, pokemontype,attacks);
    }

    public OwlUCA() {
    }

    @Override
    public String toString() {
        return "OwlUCA";
    }

}
