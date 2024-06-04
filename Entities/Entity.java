package Entities;
import PokemonFactory.Pokemon.Pokemon;
import java.util.ArrayList;


public class Entity {
    protected String name;
    protected ArrayList<Pokemon> pokemons;
    private int Xposition;
    private int YPosition;

    public Entity() {
    }

    public Entity(String name, ArrayList<Pokemon> pokemons, int xposition, int YPosition) {
        this.name = name;
        this.pokemons = pokemons;
        Xposition = xposition;
        this.YPosition = YPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public int getXposition() {
        return Xposition;
    }

    public void setXposition(int xposition) {
        Xposition = xposition;
    }

    public int getYPosition() {
        return YPosition;
    }

    public void setYPosition(int YPosition) {
        this.YPosition = YPosition;
    }

}
