package PokemonFactory.Pokemon.Psychic;

import PokemonFactory.Pokemon.Attack.PsychicAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class OwlUCA extends Pokemon implements ScratchAttack, PsychicAttack {

    public OwlUCA(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("OwlUCA", 150, 100, 80, POKEMONTYPE.PSYCHIC,attackName,damage);
    }

    public OwlUCA() {
    }


    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 10;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -100 )/100));
    }

    @Override
    public void psychicAttack(String name, int damage, Pokemon enemy) {
        name="Golpe d/dx";
        damage=100;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -100 )/100))/2);
            case WATER,FIRE,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -100 )/100));
            case NORMAL -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -100 )/100))*2);


        }
    }
}
