import java.util.Scanner;

class BuyingState implements GameState {
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
                System.out.println("You bought a Potion.");
                context.setState(new BuyingState());
                break;
            case 2:
                System.out.println("You bought a Pokéball.");
                context.setState(new BuyingState());
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
