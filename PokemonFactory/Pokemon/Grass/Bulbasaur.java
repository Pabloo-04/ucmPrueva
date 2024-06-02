package PokemonFactory.Pokemon.Grass;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class Bulbasaur extends Pokemon{
    public Bulbasaur(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype, ArrayList<Attack> attacks) {
        super(name, hp, xp, speed, pokemontype,attacks);
    }

    public Bulbasaur() {
    }

    @Override
    public String toString() {
        return "Bulbasaur";
    }
}
