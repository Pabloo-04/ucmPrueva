package PokemonFactory.Pokemon.Fire;

import PokemonFactory.Pokemon.Attack.FireAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Charmander extends Pokemon implements ScratchAttack, FireAttack {
    public Charmander(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        super("Charmander", 30, 30, 60, POKEMONTYPE.FIRE, attackName,damage);
    }

    public Charmander() {
    }

    @Override
    public void scratch(String name,int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 5;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -30 )/100));
    }

    @Override
    public void attackFire(String name, int damage, Pokemon enemy) {
        name="Fireblast";
        damage = 10;

        switch (enemy.getPokemontype()){
            case PSYCHIC, WATER -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -30 )/100))/2);
            case NORMAL,FIRE -> enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -30 )/100));
            case GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -30 )/100)*2);

        }

    }
}
