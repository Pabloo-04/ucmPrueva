package PokemonFactory.Pokemon.Pyschic;

import PokemonFactory.Pokemon.Attack.AttackScratch;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class OwlUCA extends Pokemon implements AttackScratch {

    public OwlUCA(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("OwlUCA", 150, 100, 80, POKEMONTYPE.PSYCHIC,attackName,damage);
    }

    public OwlUCA() {
    }


    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 10;

        enemy.setHp(enemy.getHp() - damage);
    }
}
