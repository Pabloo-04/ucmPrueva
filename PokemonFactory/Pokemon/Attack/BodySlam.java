package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class BodySlam implements Attack{


    @Override
    public void use(int damage, Pokemon enemy, Pokemon pokemon) {
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -50 )/100))/2);
            case WATER,FIRE,NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -50 )/100));


        }
    }

    @Override
    public String getName() {
        return "Body Slam";
    }
}
