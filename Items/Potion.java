package Items;

import Entities.Player;
import GameState.GameContext;
import PokemonFactory.Pokemon.Pokemon;

import java.io.Serializable;

public class Potion extends Buyable implements Serializable {

    public Potion() {
    }

    @Override
    public String getName() {
        return "Potion";
    }

    @Override
    public void use(Pokemon enemy, Pokemon pokemon) {
            pokemon.setHp(pokemon.getHp() + 100);
            Buyable.removeItem("Potion");
        System.out.println(GameContext.getInstance().getPlayer().getName() + " gave " + pokemon.getName() + "a potion");

    }

    @Override
    public String toString() {
        return "Potion";
}
}