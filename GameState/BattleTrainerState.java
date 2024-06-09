package GameState;

import Entities.Entity;
import PokemonFactory.FactoryClient;
import PokemonFactory.Pokemon.Pokemon;
import PokemonFactory.PokemonEnum;

import java.util.ArrayList;
import java.util.Random;

public class BattleTrainerState extends BattleState {
    private Entity trainer;

    public BattleTrainerState(Entity enemy) {
        this.trainer = enemy;
    }

    @Override
    protected void initializeOpponentPokemon() {
        opponentPokemon = trainer.getPokemons().get(0);
    }

    @Override
    protected void displayBattleStartMessage() {
        System.out.println("Trainer challenges you with " + opponentPokemon.getName() + "!");
        System.out.println("HP: " + opponentPokemon.getHp() + " | LVL: " + opponentPokemon.getLevel() + " | SPEED " + opponentPokemon.getSpeed());
    }

    @Override
    protected void handleVictory() {
        GameContext.getInstance().setGamelevel(GameContext.getInstance().getGamelevel() + 1);
        System.out.println(opponentPokemon.getName() + " fainted! You win!");
        GameContext.getInstance().player.setMoney(GameContext.getInstance().player.getMoney() + 20);
        playerPokemon.gainXp(opponentPokemon.getLevel() * 3);
        playerPokemon.checkLevelUp();
        GameContext.getInstance().setState(new ExploringState());
    }

    @Override
    protected void handleDefeat() {
        System.out.println(playerPokemon.getName() + " fainted! You lose!");
        GameContext.getInstance().setState(new ExploringState());
    }

    @Override
    protected boolean canRun() {
        return false;
    }

    @Override
    protected void opponentTurn() {
        if (opponentPokemon.isFainted()) {
            if (canSwitchTrainerPokemon()) {
                switchTrainerPokemonAutomatically();
            } else {
                handleVictory();
                return;
            }
        } else {
            Random random = new Random();
            opponentPokemon.getAttacks().get(random.nextInt(opponentPokemon.getAttacks().size())).use(playerPokemon, opponentPokemon);
            displayBattleStatus();
        }
    }

    @Override
    protected void playerTurn() {
        super.playerTurn();
        if (opponentPokemon.isFainted()) {
            if (canSwitchTrainerPokemon()) {
                switchTrainerPokemonAutomatically();
            } else {
                handleVictory();
                return;
            }
        } else {
            opponentTurn();
        }
    }

    private boolean canSwitchTrainerPokemon() {
        for (Pokemon pokemon : trainer.getPokemons()) {
            if (!pokemon.isFainted() && pokemon != opponentPokemon) {
                return true;
            }
        }
        return false;
    }

    private void switchTrainerPokemonAutomatically() {
        for (Pokemon pokemon : trainer.getPokemons()) {
            if (!pokemon.isFainted() && pokemon != opponentPokemon) {
                opponentPokemon = pokemon;
                System.out.println("Trainer switches to " + opponentPokemon.getName());
                displayBattleStartMessage();
                break;
            }
        }
    }

    public static ArrayList<Pokemon> createTrainerPokemons(int trainerType) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        if (trainerType == 1) {
            switch (GameContext.getInstance().getInitialChoice()) {
                case 1:
                    pokemons.add(FactoryClient.getPokemon(PokemonEnum.BULBASAUR, 40, 10, 40, 30, 30));
                    pokemons.add(FactoryClient.getPokemon(PokemonEnum.SQUIRTALE, 40, 10, 40, 30, 25));
                    break;
                case 2:
                    pokemons.add(FactoryClient.getPokemon(PokemonEnum.SQUIRTALE, 40, 10, 40, 30, 25));
                    pokemons.add(FactoryClient.getPokemon(PokemonEnum.CHARMANDER, 25, 10, 25, 0, 45));
                    break;
                case 3:
                    pokemons.add(FactoryClient.getPokemon(PokemonEnum.CHARMANDER, 25, 10, 25, 0, 45));
                    pokemons.add(FactoryClient.getPokemon(PokemonEnum.BULBASAUR, 40, 10, 40, 30, 30));
                    break;
                default:
                    System.out.println("Invalid initial choice.");
                    break;
            }
        } else {
            pokemons.add(FactoryClient.getPokemon(PokemonEnum.OWLUCA, 50, 15, 50, 30, 20));
            pokemons.add(FactoryClient.getPokemon(PokemonEnum.SNORLAX, 35, 10, 35, 30, 5));
        }
        return pokemons;
    }
}
