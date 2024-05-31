package Items;

public class Potion extends Buyable{
    public Potion(String name, int price) {
        super("Potion", 10);
    }

    public Potion() {
    }

    @Override
    public String toString() {
        return "Potion";
}
}