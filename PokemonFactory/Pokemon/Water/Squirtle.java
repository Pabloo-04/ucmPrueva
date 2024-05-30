package PokemonFactory.Pokemon.Water;

import PokemonFactory.Pokemon.Attack.AttackScratch;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Squirtle extends Pokemon implements AttackScratch {

    public Squirtle(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackDamage,int damage) {
        super("Squirtle", 40, 30, 50,POKEMONTYPE.WATER,attackDamage,damage);
    }

    public Squirtle() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 3;

        enemy.setHp(enemy.getHp() - damage);
    }
}
