package PokemonFactory.Pokemon;

import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.FireBlast;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Pokemon implements Serializable {
    private String name;
    private int hp;

    private int hpMax;
    private int xp;
    private int level;
    private int speed;
    private POKEMONTYPE pokemontype;
    private ArrayList<Attack> attacks = new ArrayList<>();

    public Pokemon(String name, int hp, int level ,int hpMax, int xp,int speed, POKEMONTYPE pokemontype,ArrayList<Attack> attacks){
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.hpMax =hpMax;
        this.xp = xp;
        this.pokemontype = pokemontype;
        this.speed=speed;
        this.attacks = attacks;
    }



    public Pokemon() {
    }
    public int getHpMax() {
        if(level == 1){
            return hpMax;
        }else{
            return hpMax +  5*(level-1);
        }
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
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
        if (hp < 0) {
            this.hp= 0;
        } else {
            this.hp = hp;
        }
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
        if(level == 1){
            return speed;
        }else{
            return speed +  5*level;
        }
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isFainted(){
        return hp <= 0;
    }
}
