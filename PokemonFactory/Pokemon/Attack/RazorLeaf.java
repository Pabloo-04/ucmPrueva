package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public class RazorLeaf implements TypedAttack {

    @Override
    public int getBaseDamage() {
        return 12;
    }

    @Override
    public double getTypeMultiplier(Pokemon enemy) {
        switch (enemy.getPokemontype()) {
            case PSYCHIC, FIRE:
                return 0.5; // Not very effective
            case NORMAL, GRASS:
                return 1.0; // Neutral
            case WATER:
                return 2.0; // Super effective
            default:
                return 1.0; // Neutral for all other types
        }
    }

    @Override
    public double getMissChance() {
        return 0.20;
    }

    @Override
    public String getName() {
        return "Razor Leaf";
    }
}
