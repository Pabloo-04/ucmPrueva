package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.HydroBomb;
import PokemonFactory.Pokemon.Attack.WaterGun;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Water.Squirtle;

import java.util.ArrayList;

public class SquirtleFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp, int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new WaterGun());
        attacks.add(new HydroBomb());
        return new Squirtle("Squirtle", 40, 30, 50,POKEMONTYPE.WATER,attacks);
    }
}
