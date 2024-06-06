package PokemonFactory.Pokemon.Attack;

import PokemonFactory.Pokemon.Pokemon;

import java.io.Serializable;

public interface Attack extends Serializable {
    void use(Pokemon enemy, Pokemon pokemon);
    String getName();
}
