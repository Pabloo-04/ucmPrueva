package SaveAndLoad;

import PokemonFactory.Pokemon.Pokemon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStorage implements Serializable {
    String playerName;
    int money;
    public Map<String, Integer> itemCounts = new HashMap<>();
    public ArrayList<Pokemon> pokemons = new ArrayList<>();
    int GameLevel;

    int initiChoice;
}
