package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.HydroBomb;
import PokemonFactory.Pokemon.Attack.WaterGun;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.Pokemon.Water.Psyduck;

import java.util.ArrayList;

public class PsyduckFactory implements PokemonFactory {
    @Override
    public Pokemon createPokemon(int hp, int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new WaterGun());
        attacks.add(new HydroBomb());
        return new Psyduck("Psyduck", hp, xp, speed, POKEMONTYPE.WATER,attacks);
    }
}
