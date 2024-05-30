package PokemonFactory.Pokemon.Normal;

import PokemonFactory.Pokemon.Attack.NormalAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Jigglypuff extends Pokemon implements ScratchAttack, NormalAttack {
    public Jigglypuff(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Jigglypuff", 80, 25, 20, POKEMONTYPE.NORMAL,attackName,damage);
    }

    public Jigglypuff() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 3;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -25 )/100));
    }


    @Override
    public void attackNormal(String name, int damage, Pokemon enemy) {
        name="Hyper Voice";
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -25 )/100))/2);
            case WATER,FIRE,NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -25 )/100));


        }
    }
    }

