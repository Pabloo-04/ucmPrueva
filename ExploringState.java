import java.util.Scanner;

class ExploringState implements GameState {
    @Override
    public void handle(GameContext context) {
        System.out.println("Exploring the map. You can move freely.");
        System.out.println("1. Explore");
        System.out.println("2. Buy stuff");
        System.out.println("3. Battle");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You continue exploring.");
                context.setState(new ExploringState());
                break;
            case 2:
                context.setState(new BuyingState());
                break;
            case 3:
                context.setState(new BattlingState());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                context.setState(new ExploringState());
                break;
        }
    }
}
