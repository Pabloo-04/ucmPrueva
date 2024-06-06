package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class VineWhip implements Attack{
    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        int damage = 10 + (pokemon.getLevel() - 1) * (int) (10* 0.8);
        switch (enemy.getPokemontype()){
            case PSYCHIC, FIRE -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -30 )/100))/2);
            case NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -30 )/100));
            case WATER -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -30)/100)*2);

        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Vine Whip";
    }
}
