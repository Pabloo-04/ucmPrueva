package GameState;
import Items.*;
import java.util.ArrayList;

import java.util.Scanner;

public class BuyingState implements GameState {

    public BuyingState(){

    }


@Override
public void handle(GameContext context) {
    System.out.println("Buying stuff. Choose an option from the store.");
    System.out.println("1. Buy Potion");
    System.out.println("2. Buy Pokéball");
    System.out.println("3. Exit Store");

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            Potion p = new Potion();
            System.out.println("You bought a Potion. It has been added to your inventory.");
            context.addItem(p);

            break;
        case 2:
            Pokeball pb = new Pokeball();
            System.out.println("You bought a Pokéball. It has been added to your inventory.");
            context.addItem(pb);
            break;
        case 3:
            context.setState(new ExploringState());
            break;
        default:
            System.out.println("Invalid choice, please try again.");
            context.setState(new BuyingState());
            break;
   }

}

}