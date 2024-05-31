package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class Scratch implements Attack{
    @Override
    public void use(int damage, Pokemon enemy, Pokemon pokemon) {
        damage = 5;

        enemy.setHp(enemy.getHp() - damage*(1 + (pokemon.getXp() -30)/100));
    }

    @Override
    public String getName() {
        return "Scratch";
    }
}
