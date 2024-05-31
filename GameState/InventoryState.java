package GameState;
import java.util.ArrayList;
import java.util.Scanner;

import Items.*;

public class InventoryState implements GameState{

    public InventoryState() {
    }

    @Override
    public void handle(GameContext context) {
        System.out.println("Checking Your bag.");



        if (context.player.getItems() == null){
            System.out.println("No Items in Inventory!");
        }else{
            for (Buyable item : context.player.getItems()) {
                System.out.println(item);
            }
        }

        System.out.println("Press 1 to exit inventory");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setState(new PauseState());
 }
}

}