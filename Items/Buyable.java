package Items;

import GameState.GameContext;

import java.io.Serializable;
import java.util.ArrayList;

public class Buyable implements Serializable {
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

    public void displayItems(ArrayList<Buyable> items) {
        ArrayList<ItemCount> itemCounts = countItems(items);

        for (ItemCount itemCount : itemCounts) {
            System.out.println(itemCount.name + " x" + itemCount.count);
        }

        /*ArrayList<ItemCount> itemCounts = new ArrayList<>();

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

        for (ItemCount itemCount : itemCounts) {
            System.out.println(itemCount.name + " x" + itemCount.count);
        }*/
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

    public static int itemAmmount(String itemName) {
        itemAmount = 0;  // Reset the item amount before calculation
        for (Buyable item : GameContext.getInstance().getPlayer().getItems()) {
            if (item.getName().equals(itemName)) {
                itemAmount++;
            }
        }
        return itemAmount;

        /*int ammount = 0;
        for(Buyable item : GameContext.getInstance().getPlayer().getItems()) {
            if(item.getName().equals(GameContext.getInstance().getPlayer().getItems())) {
                ammount++;
            }
        }
        return ammount;*/
    }
}