package PokemonFactory.Pokemon.Water;

import PokemonFactory.Pokemon.Attack.AttackScratch;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Psyduck extends Pokemon implements AttackScratch {
    public Psyduck(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Psyduck", 50, 25, 35, POKEMONTYPE.WATER,attackName,damage);
    }

    public Psyduck() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 5;

        enemy.setHp(enemy.getHp() - damage);
    }
}
