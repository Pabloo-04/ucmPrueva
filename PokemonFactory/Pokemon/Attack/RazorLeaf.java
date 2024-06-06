package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class RazorLeaf implements Attack{
    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        int damage = 10;
        switch (enemy.getPokemontype()){
            case PSYCHIC, FIRE -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -25 )/100))/2);
            case NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25 )/100));
            case WATER -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25)/100)*2);

        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Razor Leaf";
    }
}
