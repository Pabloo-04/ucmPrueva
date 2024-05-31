package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class RazorLeaf implements Attack{
    @Override
    public void use(int damage, Pokemon enemy, Pokemon pokemon) {
        damage=10;
        switch (enemy.getPokemontype()){
            case PSYCHIC, FIRE -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -25 )/100))/2);
            case NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25 )/100));
            case WATER -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25)/100)*2);

        }
    }

    @Override
    public String getName() {
        return "Razor Leaf";
    }
}