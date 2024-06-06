package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class HyperVoice implements Attack{
    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        int damage = 12 + (pokemon.getLevel() - 1) * (int) (12* 0.8);
        switch (enemy.getPokemontype()){
            case PSYCHIC -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -25 )/100))/2);
            case WATER,FIRE,NORMAL,GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -25 )/100));


        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Hyper Voice";
    }
}
