package PokemonFactory.Pokemon.Fire;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Growlithe extends Pokemon{
    public Growlithe(String name, int hp, int level, int hpMax,int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, level, hpMax,xp, speed, pokemontype,attacks);
    }

    public Growlithe() {
    }

    @Override
    public String toString() {
        return "Growlithe";
    }

}
