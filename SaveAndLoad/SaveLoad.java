package SaveAndLoad;

import GameState.GameContext;
import Items.Buyable;
import Items.Pokeball;
import Items.Potion;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveLoad {

    public SaveLoad() {
    }

    public Buyable getItem(String itemName){
        Buyable item = null;
        switch(itemName){
            case "Pokeball":
                item = new Pokeball();
                break;
            case "Potion":
                item = new Potion();
                break;
        }
        return item;
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
            ds.itemCounts.putAll(itemCountMap);
            ds.pokemons.addAll(GameContext.getInstance().getPlayer().getPokemons());
            oos.writeObject(ds);
            oos.close();
            System.out.println("You´ve saved the game");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't save game");
        }
    }

    public void load() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("save.dat")));
            DataStorage ds = (DataStorage) ois.readObject();
            ois.close();
            GameContext.getInstance().getPlayer().setMoney(ds.money);
            GameContext.getInstance().getPlayer().getItems().clear(); 

            for (Map.Entry<String, Integer> entry : ds.itemCounts.entrySet()) {
                String itemName = entry.getKey();
                int itemAmount = entry.getValue();

                for (int j = 0; j < itemAmount; j++) {
                    Buyable item = getItem(itemName);
                    if (item != null) {
                        GameContext.getInstance().getPlayer().getItems().add(item);
                    }
                }
            }
            GameContext.getInstance().getPlayer().getPokemons().clear();
            GameContext.getInstance().getPlayer().getPokemons().addAll(ds.pokemons);
            System.out.println("Loading game...");
        } catch (Exception e) {
            System.out.println("Couldn't load game");
        }
    }
}