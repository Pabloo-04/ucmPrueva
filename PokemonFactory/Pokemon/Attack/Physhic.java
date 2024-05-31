package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class Physhic implements Attack{


    @Override
    public void use(int damage, Pokemon enemy, Pokemon pokemon) {
        damage=100;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -100 )/100))/2);
            case WATER,FIRE,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -100 )/100));
            case NORMAL -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -100 )/100))*2);


        }
    }

    @Override
    public String getName() {
        return "Psychic";
    }

}
