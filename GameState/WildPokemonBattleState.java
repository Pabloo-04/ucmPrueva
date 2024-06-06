package GameState;

import Items.Buyable;
import PokemonFactory.Pokemon.Pokemon;

import java.util.Scanner;
import java.util.Random;

public class WildPokemonBattleState implements GameState {
    private Pokemon playerPokemon;
    private Pokemon wildPokemon;



    @Override
    public void handle() {
        playerPokemon = GameContext.getInstance().player.getPokemons().getFirst();
        wildPokemon = WildPokemonSelector.getRandomWildPokemon();
        System.out.println("A wild " + wildPokemon.getName() + " appeared!");
        System.out.println("HP: " + wildPokemon.getHp() + " | LVL: " + wildPokemon.getLevel() + " | SPEED " + wildPokemon.getSpeed());
        boolean firstPlayer = playerPokemon.getSpeed() >= wildPokemon.getSpeed();
        while (!playerPokemon.isFainted() && !wildPokemon.isFainted()) {
            if (firstPlayer) {
                playerTurn();
                if (wildPokemon.isFainted()) {
                    System.out.println(wildPokemon.getName() + " fainted! You win!");
                    GameContext.getInstance().player.setMoney(GameContext.getInstance().player.getMoney() + 10);
                    playerPokemon.gainXp(wildPokemon.getLevel()*2);
                    playerPokemon.checkLevelUp();
                    GameContext.getInstance().setState(new ExploringState()); // Go back to exploring after winning
                }
            } else {
                opponentTurn();
                if (playerPokemon.isFainted()) {
                    System.out.println(playerPokemon.getName() + " fainted! You lose!");
                    GameContext.getInstance().setState(new ExploringState()); // Go back to exploring after losing

                }
            }

            // Alternate turns
            firstPlayer = !firstPlayer;
        }

    }

    private void playerTurn() {

        playerPokemon  = GameContext.getInstance().player.getPokemons().getFirst();
        System.out.println("Your turn.  ");
        System.out.println("-------------");
        System.out.println("1.Attack \n2.Bag \n3.Run");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(); scanner.nextLine();
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
                playerPokemon.getAttacks().get(option).use(10,wildPokemon,playerPokemon);

                break;
            case 2:
                System.out.println("1.Use Pokeball\n2.Use potion");
                int selection = scanner.nextInt();
                if(selection == 1){
                    if(Buyable.getItem("Pokeball") != null) {
                        try {
                            Buyable.getItem("Pokeball").use(wildPokemon, playerPokemon);

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
                GameContext.getInstance().setState(new ExploringState());
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }


        System.out.println(playerPokemon.getName() + " | HP: " + playerPokemon.getHp());
        System.out.println(wildPokemon.getName() + " | HP: " + wildPokemon.getHp());
    }

    private void opponentTurn() {
        System.out.println("Wild Pokémon's turn.");
        Random random = new Random();
        wildPokemon.getAttacks().get(random.nextInt(wildPokemon.getAttacks().size())).use(10,playerPokemon,wildPokemon);
        System.out.println(playerPokemon.getName() + " | HP: " + playerPokemon.getHp());
        System.out.println(wildPokemon.getName() + " | HP: " + wildPokemon.getHp());


    }

    public Pokemon getPlayerPokemon() {
        return playerPokemon;
    }

    public Pokemon getOpponentPokemon() {
        return wildPokemon;
    }
}
