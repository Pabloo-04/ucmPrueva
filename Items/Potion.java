package Items;

import java.io.Serializable;

public class Potion extends Buyable implements Serializable {

    public Potion() {
    }

    @Override
    public String getName() {
        return "Potion";
    }

    @Override
    public String toString() {
        return "Potion";
}
}