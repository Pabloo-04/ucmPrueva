package PokemonFactory.Pokemon;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int xp;
    private int speed;
    private POKEMONTYPE pokemontype;
    private String attackName;
    private int damage;


    public Pokemon(String name, int hp, int xp,int speed, POKEMONTYPE pokemontype,String attackName,int damage) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.pokemontype = pokemontype;
        this.speed=speed;
        this.attackName=attackName;
        this.damage=damage;
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

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
