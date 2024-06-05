package PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal;

import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Attack.BodySlam;
import PokemonFactory.Pokemon.Attack.Scratch;
import PokemonFactory.Pokemon.Normal.Jigglypuff;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class JigglypuffFactory implements PokemonFactory {
    public Pokemon createPokemon(int hp,int level,int hpMax, int xp, int speed) {
        ArrayList<Attack> attacks = new ArrayList<>();
        attacks.add(new BodySlam());
        attacks.add(new Scratch());
        return new Jigglypuff("Jigglypuff", hp,level,hpMax, xp, speed, POKEMONTYPE.NORMAL,attacks);
    }
}
