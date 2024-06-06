package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class Physhic implements Attack{


    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        int damage = 10;
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -100 )/100))/2);
            case WATER,FIRE,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -100 )/100));
            case NORMAL -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -100 )/100))*2);


        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Psychic";
    }

}
