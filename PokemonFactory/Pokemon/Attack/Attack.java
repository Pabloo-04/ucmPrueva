package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

public interface Attack {
    void use(int damage, Pokemon enemy, Pokemon pokemon);
    String getName();
}
