package PokemonFactory.Pokemon.Grass;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Oddish extends Pokemon{
    public Oddish(String name, int hp,int hpMax, int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, hpMax,xp, speed, pokemontype,attacks);
    }

    public Oddish() {
    }

    @Override
    public String toString() {
        return "Oddish";
    }

}
