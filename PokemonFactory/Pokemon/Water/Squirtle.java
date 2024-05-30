package PokemonFactory.Pokemon.Water;

import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.Attack.WaterAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Squirtle extends Pokemon implements ScratchAttack, WaterAttack {

    public Squirtle(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackDamage,int damage) {
        super("Squirtle", 40, 30, 50,POKEMONTYPE.WATER,attackDamage,damage);
    }

    public Squirtle() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 3;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -30)/100));
    }

    @Override
    public void WaterAttack(String name, int damage, Pokemon enemy) {
        name="Water gun";
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC,GRASS -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -30 )/100))/2);
            case WATER,NORMAL -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -30 )/100));
            case FIRE -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -30 )/100))*2);


        }
    }
}
