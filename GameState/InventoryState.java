package GameState;
import java.util.ArrayList;
import java.util.Scanner;

import Items.*;
import PokemonFactory.Pokemon.Pokemon;

public class InventoryState implements GameState{

    public InventoryState() {
    }

    @Override
    public void handle(GameContext context) {
        System.out.println("Checking Your bag.");

        System.out.println("------------Items--------------");
        if (context.player.getItems() == null){
            System.out.println("No Items in bag!");
        }else{
            System.out.println("Money: " + context.player.getMoney());
            Buyable.displayItems(context.player.getItems());
            /*System.out.println("Items: " + context.player.getItems());
            for (Buyable item : context.player.getItems()) {
                System.out.println(item);
            }*/
        }

        System.out.println("-----------Pokemons-------------");
        if (context.player.getPokemons() == null){
            System.out.println("You have no Pokemons!");
        }else{
            for(Pokemon p: context.getPlayer().getPokemons()){
                System.out.println(p.getName()+ " | Hp: " + p.getHp());
            }
        }

        System.out.println("Press 1 to exit bag");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setState(new PauseState());
        }
    }

}