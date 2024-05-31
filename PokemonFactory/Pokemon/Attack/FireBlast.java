package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class FireBlast implements Attack{

    @Override
    public void use(int damage, Pokemon enemy,Pokemon pokemon) {
        damage = 10;

        switch (enemy.getPokemontype()){
            case PSYCHIC, WATER -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -30 )/100))/2);
            case NORMAL,FIRE -> enemy.setHp(enemy.getHp() - damage*(1 + (pokemon.getXp() -30 )/100));
            case GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -30 )/100)*2);

        }
    }

    @Override
    public String getName() {
        return "Fireblast";
    }
}