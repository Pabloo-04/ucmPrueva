package GameState;

import PokemonFactory.FactoryClient;
import PokemonFactory.PokemonEnum;

import java.util.Scanner;

public class ChoosingPokemonState implements GameState{
    @Override
    public void handle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NPC: Hey! This place is absolute chaos!");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        System.out.println("NPC: You want to go in? Here, I'll give you a couple of things that can help! (the NPC has has given you 100 coins, lucky you!).");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        System.out.println("NPC: That's all the money I've got left... when the pokemons went crazy, they stole all my money!");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        System.out.println("NPC: Whenever you defeat one, they'll surely drop some coin they stole from me! Those darn pokemons....");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        System.out.println("NPC: Anyway, here, to help you in your journey, choose one of these pokemons. I hope they help in your adventure!");

        boolean validChoice = false;
        while(!validChoice) {
            System.out.println("1.Charmander");
            System.out.println("Stats: | HP: 35 | LVL: 5 | SPEED: 57");
            System.out.println("2.Bulbasaur");
            System.out.println("Stats: | HP: 42 | LVL: 5 | SPEED: 38");
            System.out.println("3.Squirtle");
            System.out.println("Stats: | HP: 56 | LVL: 5 | SPEED: 32");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have chosen Charmander!");
                    GameContext.getInstance().player.getPokemons().add(FactoryClient.getPokemon(PokemonEnum.CHARMANDER,35 ,5,35,0, 57));
                    validChoice = true;
                    break;
                case 2:
                    System.out.println("You have chosen Bulbasaur!");
                    GameContext.getInstance().player.getPokemons().add(FactoryClient.getPokemon(PokemonEnum.BULBASAUR, 42,5,42, 0, 38));
                    validChoice = true;
                    break;
                case 3:
                    System.out.println("You have chosen Squirtle!");
                    GameContext.getInstance().player.getPokemons().add(FactoryClient.getPokemon(PokemonEnum.SQUIRTALE, 56,5,56, 0, 32));
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid Pokemon!");
                    break;
            }
        }
        System.out.println("NPC: Remember, Pokemons that are faster than yours attack first, so be careful! ");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        sc.nextLine();
        System.out.println("NPC: Oh, and one more thing! I've heard people say there is an extremely rare pokemon roaming around... beware if you find it, it must be very powerful!");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        System.out.println("NPC: That's all I can do for you! Please beware and save us all from OwlUCA!");
        System.out.println("Press enter to begin the adventure...");
        sc.nextLine();
        GameContext.getInstance().setState(new ExploringState());
    }
}
