package GameState;

import java.util.Scanner;

class BattlingState implements GameState {
    @Override
    public void handle() {
        System.out.println("Battling an opponent.");
        System.out.println("1. Attack");
        System.out.println("2. Use Item");
        System.out.println("3. Run");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();


    }
}
