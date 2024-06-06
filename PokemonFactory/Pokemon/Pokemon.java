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
      return  hpMax;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isFainted(){
        return hp <= 0;
    }

    public void gainXp(int xpGained) {
        this.xp += xpGained;
        checkLevelUp();
    }

    public void checkLevelUp() {
        double requiredXp = Math.ceil(Math.sinh(Math.sqrt(level)));
        while (xp >= requiredXp) {
            xp -= requiredXp;
            levelUp();
            requiredXp = Math.ceil(Math.sinh(Math.sqrt(level))); // Recalculate required XP for the new level
        }

    }

    private void levelUp() {
        level++;
       // Reset XP after leveling up
        hpMax = hpMax + (int)( hpMax*0.1); // Increase max HP
        // = maxHp; // Restore HP to full on level up
        speed   =  speed + (int)(speed*0.05); // Increase speed

        System.out.println(name + " leveled up to level " + level + "!");
        System.out.println("New stats | HpMax: " + hpMax + " | Speed: " + speed);
    }
}
