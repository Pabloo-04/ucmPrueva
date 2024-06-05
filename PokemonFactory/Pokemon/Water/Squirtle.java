package PokemonFactory.Pokemon.Water;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.BodySlam;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Squirtle extends Pokemon{

    public Squirtle(String name, int hp, int nivel, int hpMax , int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, nivel, hpMax, xp, speed, pokemontype, attacks);
    }

    public Squirtle() {
    }

    @Override
    public String toString() {
        return "Squirtle";
    }
}
