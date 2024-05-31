package Items;

public class Pokeball extends Buyable{
    public Pokeball(String name, int price) {
        super("Pokeball", 10);
    }

    public Pokeball() {
    }

    @Override
    public String toString() {
        return "Pokeball";
}

}