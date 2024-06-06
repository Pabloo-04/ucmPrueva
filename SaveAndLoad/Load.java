package SaveAndLoad;

import GameState.GameContext;
import Items.Buyable;
import Items.Pokeball;
import Items.Potion;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

public class Load {
    public Load() {
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

    public void load() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("save.dat")));
            DataStorage ds = (DataStorage) ois.readObject();
            ois.close();
            GameContext.getInstance().getPlayer().setName(ds.playerName);
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
            throw new NullPointerException();
        }
    }
}
