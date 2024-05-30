package PokemonFactory.Pokemon.Psychic;

import PokemonFactory.Pokemon.Attack.PsychicAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Mew extends Pokemon implements ScratchAttack, PsychicAttack {

    public Mew(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Mew", 100, 100, 100, POKEMONTYPE.PSYCHIC,attackName,damage);
    }

    public Mew() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 7;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -100 )/100));
    }

    @Override
    public void psychicAttack(String name, int damage, Pokemon enemy) {
        name="Psychic";
        damage=100;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -100 )/100))/2);
            case WATER,FIRE,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -100 )/100));
            case NORMAL -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -100 )/100))*2);


        }
    }
}
