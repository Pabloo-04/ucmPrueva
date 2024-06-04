package GameState;

import Entities.Player;
import Items.Buyable;
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
        System.out.println("Your turn.  ");
        System.out.println("-------------");
        System.out.println("1.Attack \n2.Bag \n3.Run");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                for (int i = 0; i < playerPokemon.getAttacks().size(); i++) {
                    System.out.println((i + 1) + ": " + playerPokemon.getAttacks().get(i).getName());
                }
                int option = scanner.nextInt() - 1;
                if (option < 0 || choice >= playerPokemon.getAttacks().size()) {
                    System.out.println("Invalid choice! Try again.");
                    return;
                }//Check this
                playerPokemon.getAttacks().get(choice).use(50,wildPokemon,playerPokemon);
                break;
            case 2:
                System.out.println("1.Use Pokeball\n2.Use potion");
                int selection = scanner.nextInt();
                if(selection == 1){
                    if(Buyable.getItem("Pokeball") != null) {
                        try {
                            Buyable.getItem("Pokeball").use(wildPokemon, playerPokemon);
                            GameContext.getInstance().setState(new ExploringState());
                        } catch (Exception e) {
                            System.out.println("Something went wrong");
                        }
                    }else{
                        System.out.println("You don't have pokeballs...");
                    }
                } else if (selection ==2) {
                        if(Buyable.getItem("Potion") != null) {
                            try {
                                Buyable.getItem("Potion").use(wildPokemon, playerPokemon);
                            } catch (Exception e) {
                                System.out.println("Something went wrong");
                            }
                        }else{
                            System.out.println("You don't have potions...");
                        }
                    }
                break;
            case 3:
                System.out.println("You ran");
                context.setState(new ExploringState());
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }


        System.out.println(playerPokemon.getName() + " | " + "HP: " + playerPokemon.getHp());
        System.out.println(wildPokemon.getName() + " | " + "HP: " + wildPokemon.getHp());
        if (!wildPokemon.isFainted()) {
            opponentTurn(context);
        }
    }

    private void opponentTurn(GameContext context) {
        System.out.println("Wild Pokémon's turn.");
        Random random = new Random();
        wildPokemon.getAttacks().get(random.nextInt(wildPokemon.getAttacks().size())).use(100,playerPokemon,wildPokemon);


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
