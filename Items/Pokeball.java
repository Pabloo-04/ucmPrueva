package Items;

import java.io.Serializable;

public class Pokeball extends Buyable implements Serializable {


    public Pokeball() {
    }

    @Override
    public String getName() {
        return "Pokeball";
    }

    @Override
    public String toString() {
        return "Pokeball";
}

}