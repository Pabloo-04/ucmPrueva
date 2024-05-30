package PokemonFactory.Pokemon.Normal;

import PokemonFactory.Pokemon.Attack.AttackScratch;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Snorlax extends Pokemon implements AttackScratch {
    public Snorlax(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Snorlax", 120, 50, 10, POKEMONTYPE.NORMAL,attackName,damage);
    }

    public Snorlax() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 8;

        enemy.setHp(enemy.getHp() - damage);
    }
}
