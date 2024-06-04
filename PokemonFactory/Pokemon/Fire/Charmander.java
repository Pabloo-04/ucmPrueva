package PokemonFactory.Pokemon.Fire;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Charmander extends Pokemon{
    public Charmander(String name, int hp, int hpMax,int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, hpMax,xp, speed, pokemontype,attacks);
    }

    public Charmander() {
    }

    @Override
    public String toString() {
        return "Charmander";
    }

}
