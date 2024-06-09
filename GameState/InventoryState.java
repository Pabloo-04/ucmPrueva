package GameState;
import java.util.Scanner;

import Items.*;
import PokemonFactory.Pokemon.Pokemon;

public class InventoryState implements GameState{

    public InventoryState() {
    }

    @Override
    public void handle() {
        System.out.println("Checking Your bag.");

        System.out.println("------------Items--------------");
        if (GameContext.getInstance().player.getItems() == null){
            System.out.println("No Items in bag!");
        }else{
            System.out.println("Money: " + GameContext.getInstance().player.getMoney());
            Buyable.displayItems(GameContext.getInstance().player.getItems());
        }

        System.out.println("-----------Pokemons-------------");
        if (GameContext.getInstance().player.getPokemons() == null){
            System.out.println("You have no Pokemons!");
        }else{
            for(Pokemon p: GameContext.getInstance().getPlayer().getPokemons()){
                System.out.println(p.getName()+ " | Hp: " + p.getHp() + " | Speed: " + p.getSpeed() + " | Level: " + p.getLevel());
            }
        }

        System.out.println("Press 1 to change pokemon team");
        System.out.println("Press 2 to return to pause menu");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            GameContext.getInstance().setState(new SwitchPokemonState());
        } else if (choice == 2) {
            GameContext.getInstance().setState(new PauseState());
        }
    }

}