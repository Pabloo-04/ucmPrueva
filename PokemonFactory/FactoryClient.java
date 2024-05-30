package PokemonFactory;

import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire.CharmanderFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryFire.GrowlitheFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal.JigglypuffFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryNormal.SnorlaxFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic.MewFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic.OwlUCAFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryPhychic.PokemonEnum;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater.PsyduckFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactoryWater.SquirtleFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass.BulbasaurFactory;
import PokemonFactory.ConcretePokemonFactories.ConcreteFactroyGrass.OddishFactory;
import PokemonFactory.ConcretePokemonFactories.PokemonFactory;
import PokemonFactory.Pokemon.POKEMONTYPE;
import PokemonFactory.Pokemon.Pokemon;

public class FactoryClient {
    public FactoryClient() {
    }
    
    public Pokemon getPokemon(PokemonEnum pokemonEnum, String name,int hp,int xp,int speed,POKEMONTYPE pokemontype,String attackName, int damage){
        PokemonFactory fabric=null;

        switch (pokemonEnum){
            case CHARMANDER -> fabric=new CharmanderFactory();
            case GROWLITHE -> fabric=new GrowlitheFactory();
            case SQUIRTALE -> fabric=new SquirtleFactory();
            case PSYDUCK -> fabric=new PsyduckFactory();
            case BULBASAUR -> fabric=new BulbasaurFactory();
            case ODDISH -> fabric=new OddishFactory();
            case JIGGLYPUFF ->fabric= new JigglypuffFactory();
            case SNORLAX -> fabric=new SnorlaxFactory();
            case OWLUCA ->fabric= new OwlUCAFactory();
            case MEW ->fabric= new MewFactory();

        }
        if(fabric != null){
            return fabric.createPokemon( name, hp,  xp,  speed, pokemontype, attackName, damage);

        }else {
            System.out.println("There is no factory");
            return null;

        }
    }
}
