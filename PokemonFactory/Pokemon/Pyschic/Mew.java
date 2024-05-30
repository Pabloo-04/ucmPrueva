package PokemonFactory.Pokemon.Pyschic;

import PokemonFactory.Pokemon.Attack.AttackScratch;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Mew extends Pokemon implements AttackScratch {

    public Mew(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Mew", 100, 100, 100, POKEMONTYPE.PSYCHIC,attackName,damage);
    }

    public Mew() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 7;

        enemy.setHp(enemy.getHp() - damage);
    }
}
