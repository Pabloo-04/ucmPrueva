package PokemonFactory.Pokemon.Fire;

import PokemonFactory.Pokemon.Attack.FireAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Growlithe extends Pokemon implements ScratchAttack, FireAttack {
    public Growlithe(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype, String attackName, int damage) {
        super("Growlithe", 50, 25, 45, POKEMONTYPE.FIRE, attackName, damage);
    }

    public Growlithe() {
    }


    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
            name = "Scratch";
            damage = 5;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -25 )/100));  enemy.setHp(enemy.getHp() - damage);
    }

    @Override
    public void attackFire(String name, int damage, Pokemon enemy) {
        name="FlameThrower";
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC, WATER -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -25 )/100))/2);
            case NORMAL,FIRE -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -25 )/100));
            case GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -25 )/100)*2);

        }
    }
}
