package Entities;

import Items.Buyable;
import PokemonFactory.Pokemon.Pokemon;


import java.util.ArrayList;

public class Player extends Entity {
    protected ArrayList<Buyable> items;
    private int money;

    public Player() {

    }

    public void reset() {
        this.money = 100;
        this.items = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Player(String name, ArrayList<Pokemon> pokemons, int xposition, int YPosition, ArrayList<Buyable> items, int money) {
        super(name, pokemons, xposition, YPosition);
        this.items = items;
        this.money = money;
    }

    public ArrayList<Buyable> getItems() {
        return items;
    }

    public void setItems(ArrayList<Buyable> items) {
        this.items = items;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void move(){}

}
