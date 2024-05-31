package Items;

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
        return name;
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
}
