package PokemonFactory.Pokemon;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.FireBlast;

import java.util.ArrayList;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int xp;
    private int speed;
    protected POKEMONTYPE pokemontype;



    protected ArrayList<Attack> attacks = new ArrayList<>();

    public Pokemon(String name, int hp, int xp,int speed, POKEMONTYPE pokemontype,ArrayList<Attack> attacks){
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.pokemontype = pokemontype;
        this.speed=speed;
        this.attacks = attacks;
    }

    public Pokemon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public POKEMONTYPE getPokemontype() {
        return pokemontype;
    }

    public void setPokemontype(POKEMONTYPE pokemontype) {
        this.pokemontype = pokemontype;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }


    public boolean isFainted(){
        return hp == 0;
    }
}
