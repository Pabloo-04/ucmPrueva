package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class FireBlast implements Attack{

    @Override
    public void use(Pokemon enemy,Pokemon pokemon) {
        int damage = 15 + (pokemon.getLevel() - 1) * (int) (15 * 0.8);
        switch (enemy.getPokemontype()){
            case PSYCHIC, WATER -> enemy.setHp(enemy.getHp() - (damage*(1 + (pokemon.getXp() -30 )/100))/2);
            case NORMAL,FIRE -> enemy.setHp(enemy.getHp() - damage*(1 + (pokemon.getXp() -30 )/100));
            case GRASS -> enemy.setHp(enemy.getHp() - (damage)*(1 + (pokemon.getXp() -30 )/100)*2);

        }
        System.out.println(pokemon.getName() + " has used " + getName() +"!");
    }

    @Override
    public String getName() {
        return "Fireblast";
    }
}
