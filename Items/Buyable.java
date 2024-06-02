package Items;

import java.util.ArrayList;

public class Buyable {
    private String name;
    private int price;

    public Buyable(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Buyable() {
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

        for (ItemCount itemCount : itemCounts) {
            System.out.println(itemCount.name + " x" + itemCount.count);
        }
    }
}
