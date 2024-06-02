package PokemonFactory;

import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire.CharmanderFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire.GrowlitheFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal.JigglypuffFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal.SnorlaxFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPsychic.MewFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPsychic.OwlUCAFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater.PsyduckFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater.SquirtleFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass.BulbasaurFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass.OddishFactory;
import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.Pokemon;

public class FactoryClient {
    public FactoryClient() {}

    public static Pokemon getPokemon(PokemonEnum pokemonEnum, int hp, int xp, int speed) {
        PokemonFactory factory = null;

        switch (pokemonEnum) {
            case CHARMANDER -> factory = new CharmanderFactory();
            case GROWLITHE -> factory = new GrowlitheFactory();
            case SQUIRTALE ->  factory = new SquirtleFactory();
            case PSYDUCK -> factory = new PsyduckFactory();
            case BULBASAUR -> factory = new BulbasaurFactory();
            case ODDISH -> factory = new OddishFactory();
            case JIGGLYPUFF -> factory = new JigglypuffFactory();
            case SNORLAX -> factory = new SnorlaxFactory();
            case OWLUCA -> factory = new OwlUCAFactory();
            case MEW -> factory = new MewFactory();
            default -> {
                System.out.println("There is no factory");
                return null;
            }
        }

        return factory.createPokemon(hp, xp, speed);
    }
}
