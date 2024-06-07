package Items;

import Entities.Player;
import GameState.ExploringState;
import GameState.GameContext;
import PokemonFactory.Pokemon.Pokemon;
import java.io.Serializable;

public class Pokeball extends Buyable implements Serializable {
    public Pokeball() {
    }

    @Override
    public String getName() {
        return "Pokeball";
    }

    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
        double catchSuccessRate;
        double remainingHpPercent = (double) enemy.getHp() / enemy.getHpMax();

        if (remainingHpPercent == 1.0) {
            catchSuccessRate = 0.05;
        } else if (remainingHpPercent >= 0.75) {
            catchSuccessRate = 0.15;
        } else if (remainingHpPercent >= 0.5) {
            catchSuccessRate = 0.25;
        } else if (remainingHpPercent >= 0.16) {
            catchSuccessRate = 0.4;
        } else {
            catchSuccessRate = 0.7;
        }

        double randomValue = Math.random();

        if (randomValue < catchSuccessRate) {
            GameContext.getInstance().getPlayer().getPokemons().add(enemy);
            Buyable.removeItem("Pokeball");
            System.out.println("You have caught " + enemy.getName() + "!");
            pokemon.gainXp(enemy.getLevel() * 2);
            pokemon.checkLevelUp();
            GameContext.getInstance().setState(new ExploringState());
        } else {
            System.out.println("The Pokeball missed its target!");
        }
    }

    @Override
    public String toString() {
        return "Pokeball";
    }
}