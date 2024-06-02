package GameState;

import Entities.Player;
import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Pokemon;

import java.util.Scanner;
import java.util.Random;

public class WildPokemonBattleState implements GameState {
    private Pokemon playerPokemon;
    private Pokemon wildPokemon;



    @Override
    public void handle(GameContext context) {
        playerPokemon = context.player.getPokemons().getFirst();
        wildPokemon = WildPokemonSelector.getRandomWildPokemon();
        System.out.println("Player's Pokémon attacks count: " + playerPokemon.getAttacks().size());
        System.out.println("A wild " + wildPokemon.getName() + " appeared!");

        while (!playerPokemon.isFainted() && !wildPokemon.isFainted()) {
            playerTurn(context);
            if (wildPokemon.isFainted()) {
                System.out.println(wildPokemon.getName() + " fainted! You win!");
                context.setState(new ExploringState()); // Go back to exploring after winning
                return;
            }

            opponentTurn(context);
            if (playerPokemon.isFainted()) {
                System.out.println(playerPokemon.getName() + " fainted! You lose!");
                context.setState(new ExploringState()); // Go back to exploring after losing
                return;
            }
        }
    }

    private void playerTurn(GameContext context) {
        playerPokemon = context.player.getPokemons().getFirst();
        System.out.println("Your turn. Choose a move: ");
        for (int i = 0; i < playerPokemon.getAttacks().size(); i++) {
            System.out.println((i + 1) + ": " + playerPokemon.getAttacks().get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt() - 1;
        if (choice < 0 || choice >= playerPokemon.getAttacks().size()) {
            System.out.println("Invalid choice! Try again.");
            return;
        }
        context.player.getPokemons().get(0).getAttacks().get(choice).use(100,playerPokemon,wildPokemon);
        System.out.println(playerPokemon.getName() + " | " + "HP: " + playerPokemon.getHp());
        System.out.println(wildPokemon.getName() + " | " + "HP: " + wildPokemon.getHp());
        if (!wildPokemon.isFainted()) {
            opponentTurn(context);
        }
    }

    private void opponentTurn(GameContext context) {
        System.out.println("Wild Pokémon's turn.");
        Random random = new Random();
        wildPokemon.getAttacks().get(random.nextInt(wildPokemon.getAttacks().size())).use(100,wildPokemon,playerPokemon);


        if (!playerPokemon.isFainted()) {
            playerTurn(context);
        }
    }

    public Pokemon getPlayerPokemon() {
        return playerPokemon;
    }

    public Pokemon getOpponentPokemon() {
        return wildPokemon;
    }
}
