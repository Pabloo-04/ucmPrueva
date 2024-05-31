package GameState;

/*import PokemonFactory.Pokemon.Attack.Attack;
import PokemonFactory.Pokemon.Pokemon;

import java.util.Scanner;
import java.util.Random;
public class WildPokemonBattleState implements GameState{
    private Pokemon playerPokemon;
    private Pokemon wildPokemon;

    public WildPokemonBattleState(Pokemon playerPokemon) {
        this.playerPokemon = playerPokemon;
        this.wildPokemon = WildPokemonSelector.getRandomWildPokemon();
    }

    @Override
    public void handle(GameContext context) {
        System.out.println("A wild " + wildPokemon.getName() + " appeared!");
        while (!playerPokemon.isFainted() && !wildPokemon.isFainted()) {
            playerTurn(context);
            if (wildPokemon.isFainted()) {
                System.out.println(wildPokemon.getName() + " fainted! You win!");
                context.setState(new ExploringState()); // Go back to exploring after winning
                break;
            }

            opponentTurn(context);
            if (playerPokemon.isFainted()) {
                System.out.println(playerPokemon.getName() + " fainted! You lose!");
                context.setState(new ExploringState()); // Go back to exploring after losing
            }
        }
    }

    private void playerTurn(GameContext context) {
        System.out.println("Your turn. Choose a move:");
        for (int i = 0; i < playerPokemon.getAttacks().size(); i++) {
            System.out.println((i + 1) + ": " + playerPokemon.getAttacks().get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt() - 1;
        if (choice < 0 || choice >= playerPokemon.getAttacks().size()) {
            System.out.println("Invalid choice! Try again.");
            return;
        }

       // Attack move = playerPokemon.getAttacks().get(choice);
        //move.execute(playerPokemon, wildPokemon);
        playerPokemon.getAttacks().get(choice).use(100,wildPokemon,playerPokemon);
        context.setState(new CheckBattleState(this));
    }

    private void opponentTurn(GameContext context) {
        System.out.println("Wild Pokémon's turn.");
        Random random = new Random();
        Attack move = wildPokemon.getAttacks().get(random.nextInt(wildPokemon.getAttacks().size()));
        move.execute(wildPokemon, playerPokemon);

        context.setState(new CheckBattleState(this));
    }

    public Pokemon getPlayerPokemon() {
        return playerPokemon;
    }

    public Pokemon getOpponentPokemon() {
        return wildPokemon;
    }
}*/


