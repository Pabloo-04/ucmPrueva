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
        if(pokemon.getHp() > pokemon.getHpMax()) pokemon.setHp(pokemon.getHpMax());
        System.out.println(GameContext.getInstance().getPlayer().getName() + " gave " + pokemon.getName() + " a potion");
        Buyable.removeItem("Potion");
    }

    @Override
    public String toString() {
        return "Potion";
}
}