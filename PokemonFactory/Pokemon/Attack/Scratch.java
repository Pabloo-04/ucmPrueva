package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class Scratch implements Attack{
    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        int damage = 6 + (pokemon.getLevel() - 1) * (int) (6* 0.08);
        enemy.setHp(enemy.getHp() - damage*(1 + (pokemon.getXp() -30)/100));
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Scratch";
    }
}
