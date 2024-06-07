package Items;

import Entities.Player;
import GameState.GameContext;
import PokemonFactory.Pokemon.Pokemon;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Buyable implements Serializable {
    private String name;
    private int price;
    protected static int itemAmount = 0;

    public Buyable(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Buyable() {
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String toString() {
        return name + ";" + price;
    }

    public String getName() {
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price =price;
    }

    public abstract void use(Pokemon enemy, Pokemon pokemon);
    public static void displayItems(ArrayList<Buyable> items) {
        ArrayList<ItemCount> itemCounts = countItems(items);

        for (ItemCount itemCount : itemCounts) {
            System.out.println(itemCount.name + " x" + itemCount.count);
        }
    }

    private static ArrayList<ItemCount> countItems(ArrayList<Buyable> items) {
        ArrayList<ItemCount> itemCounts = new ArrayList<>();

        for (Buyable item : items) {
            String itemName = item.getName();
            boolean found = false;

            for (ItemCount itemCount : itemCounts) {
                if (itemCount.name.equals(itemName)) {
                    itemCount.count++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                itemCounts.add(new ItemCount(itemName));
            }
        }

        return itemCounts;
    }

    public static void removeItem(String name){
        for(int i = 0 ; i < GameContext.getInstance().getPlayer().getItems().size(); i++){
            if(GameContext.getInstance().getPlayer().getItems().get(i).getName()  == name){
                GameContext.getInstance().getPlayer().getItems().remove(i);
            }
        }
    }

    public static Buyable getItem(String name) {

        Buyable item = null;
        for (Buyable i : GameContext.getInstance().getPlayer().getItems()) {
            if (i.getName() == name){
                item = i;
                return i;
            }

        }
        return null;
    }
}