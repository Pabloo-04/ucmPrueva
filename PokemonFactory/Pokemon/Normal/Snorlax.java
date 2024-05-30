package PokemonFactory.Pokemon.Normal;

import PokemonFactory.Pokemon.Attack.NormalAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Snorlax extends Pokemon implements ScratchAttack, NormalAttack {
    public Snorlax(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Snorlax", 120, 50, 10, POKEMONTYPE.NORMAL,attackName,damage);
    }

    public Snorlax() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 8;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -50 )/100));
    }


    @Override
    public void attackNormal(String name, int damage, Pokemon enemy) {
        name="Body Slam";
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -50 )/100))/2);
            case WATER,FIRE,NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -50 )/100));


        }
    }
}
