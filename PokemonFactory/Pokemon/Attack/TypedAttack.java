package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

import java.util.Random;

public interface TypedAttack extends Attack {
    double getTypeMultiplier(Pokemon enemy);

    double getMissChance();

    @Override
    default void use(Pokemon enemy, Pokemon pokemon) {
        double missChance = getMissChance();
        if (Math.random() < missChance) {
            System.out.println(pokemon.getName() + "'s " + getName() + " missed!");
            return;
        }

        int baseDamage = getBaseDamage();
        double levelMultiplier = 1 + (pokemon.getLevel() - 1) * 0.05;
        double typeMultiplier = getTypeMultiplier(enemy);
        double xpMultiplier = 1 + ((pokemon.getXp() - 30) / 100.0) * 0.2;

        int damage = (int) (baseDamage * levelMultiplier * typeMultiplier * xpMultiplier);
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(pokemon.getName() + " has used " + getName() + "!");
        printEffectivenessMessage(typeMultiplier);
    }

    int getBaseDamage();

    default void printEffectivenessMessage(double typeMultiplier) {
        if (typeMultiplier == 0.5) {
            System.out.println("It's not very effective...");
        } else if (typeMultiplier == 2.0) {
            System.out.println("It's super effective!");
        }
    }
}
