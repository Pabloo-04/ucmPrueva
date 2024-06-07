package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class VineWhip implements TypedAttack {

    @Override
    public int getBaseDamage() {
        return 10;
    }

    @Override
    public double getTypeMultiplier(Pokemon enemy) {
        switch (enemy.getPokemontype()) {
            case PSYCHIC, FIRE:
                return 0.5;
            case NORMAL, GRASS:
                return 1.0;
            case WATER:
                return 2.0;
            default:
                return 1.0;
        }
    }

    @Override
    public double getMissChance() {
        return 0.18;
    }

    @Override
    public String getName() {
        return "Vine Whip";
    }
}
