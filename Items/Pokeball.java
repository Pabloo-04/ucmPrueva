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

            if(enemy.getHp() < 60){
                GameContext.getInstance().getPlayer().getPokemons().add(enemy);
                Buyable.removeItem("Pokeball");
                System.out.println("You have catched " + enemy.getName() +" !!");
                GameContext.getInstance().setState(new ExploringState());
            }else{
                System.out.println(enemy.getName() + " couldn't be catched...");
            }




    }

    @Override
    public String toString() {
        return "Pokeball";
}

}