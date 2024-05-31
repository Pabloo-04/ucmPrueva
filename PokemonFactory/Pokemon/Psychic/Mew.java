package PokemonFactory.Pokemon.Psychic;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Mew extends Pokemon {

    public Mew(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,  ArrayList<Attack> attacks) {
        super(name, hp, xp, speed, pokemontype,attacks);
    }

    public Mew() {
    }

}
