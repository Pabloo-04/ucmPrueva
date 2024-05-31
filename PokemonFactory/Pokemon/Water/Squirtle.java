package PokemonFactory.Pokemon.Water;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.BodySlam;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Squirtle extends Pokemon{

    public Squirtle(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, xp, speed, pokemontype, attacks);
    }

    public Squirtle() {
    }

}
