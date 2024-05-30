package PokemonFactory.Pokemon.Water;

import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.Attack.WaterAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Psyduck extends Pokemon implements ScratchAttack, WaterAttack {
    public Psyduck(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Psyduck", 50, 25, 35, POKEMONTYPE.WATER,attackName,damage);
    }

    public Psyduck() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 5;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -25)/100));
    }

    @Override
    public void WaterAttack(String name, int damage, Pokemon enemy) {
        name="Hydro Bomb";
        damage=20;
        switch (enemy.getPokemontype()){
            case PSYCHIC,GRASS -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -25 )/100))/2);
            case WATER,NORMAL -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -25 )/100));
            case FIRE -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -25 )/100))*2);


        }
    }
}
