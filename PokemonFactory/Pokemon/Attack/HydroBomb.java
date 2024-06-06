package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class HydroBomb implements Attack {

    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        int damage = 15;
        switch (enemy.getPokemontype()) {
            case PSYCHIC, GRASS -> enemy.setHp(enemy.getHp() - (damage * (1 + (pokemon.getXp() - 25) / 100)) / 2);
            case WATER, NORMAL -> enemy.setHp(enemy.getHp() - (damage) * (1 + (pokemon.getXp() - 25) / 100));
            case FIRE -> enemy.setHp(enemy.getHp() - (damage * (1 + (pokemon.getXp() - 25) / 100)) * 2);
        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Hydro Bomb";
    }
}
