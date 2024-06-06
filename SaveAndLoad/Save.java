package SaveAndLoad;

import GameState.GameContext;
import Items.Buyable;
import Items.Pokeball;
import Items.Potion;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Save {

    public Save() {
    }


    public void save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("save.dat")));
            DataStorage ds = new DataStorage();
            ds.money = GameContext.getInstance().getPlayer().getMoney();


            Map<String, Integer> itemCountMap = new HashMap<>();
            for (Buyable item : GameContext.getInstance().getPlayer().getItems()) {
                String itemName = item.getName();
                itemCountMap.put(itemName, itemCountMap.getOrDefault(itemName, 0) + 1);
            }
            ds.playerName = GameContext.getInstance().getPlayer().getName();
            ds.itemCounts.putAll(itemCountMap);
            ds.pokemons.addAll(GameContext.getInstance().getPlayer().getPokemons());
            oos.writeObject(ds);
            oos.close();
            System.out.println("You´ve saved the game");
        } catch (Exception e) {
            System.out.println("Couldn't save game");
        }
    }

}