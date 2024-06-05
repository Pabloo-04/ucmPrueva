package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class FlameThrower implements Attack{
    @Override
    public void use(int damage, Pokemon enemy, Pokemon pokemon) {
        switch (enemy.getPokemontype()){
            case PSYCHIC, WATER -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -25 )/100))/2);
            case NORMAL,FIRE -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25 )/100));
            case GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25 )/100)*2);
        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "FlameThrower";
    }
}
