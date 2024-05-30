package PokemonFactory.Pokemon.Grass;

import PokemonFactory.Pokemon.Attack.GrassAttack;
import PokemonFactory.Pokemon.Attack.ScratchAttack;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class Bulbasaur extends Pokemon implements ScratchAttack, GrassAttack {
    public Bulbasaur(String name, int hp, int xp, int speed, POKEMONTYPE pokemontype,String attackName, int damage) {
        super("Bulbasaur", 45, 30, 45, POKEMONTYPE.GRASS,attackName,damage);
    }

    public Bulbasaur() {
    }

    @Override
    public void scratch(String name, int damage, Pokemon enemy) {
        name = "Scratch";
        damage = 5;

        enemy.setHp(enemy.getHp() - damage*(1 + (getXp() -30 )/100));    }

    @Override
    public void attackGrass(String name, int damage, Pokemon enemy) {
        name="Vine Whip";
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC, FIRE -> enemy.setHp(enemy.getHp() - (damage*(1 + (getXp() -30 )/100))/2);
            case NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -30 )/100));
            case WATER -> enemy.setHp(enemy.getHp() - (damage)*(1 + (getXp() -30)/100)*2);

        }

    }
}
