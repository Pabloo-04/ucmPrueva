import java.util.Scanner;

class BattlingState implements GameState {
    @Override
    public void handle(GameContext context) {
        System.out.println("Battling an opponent.");
        System.out.println("1. Attack");
        System.out.println("2. Use Item");
        System.out.println("3. Run");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You attacked the opponent.");
                context.setState(new BattlingState());
                break;
            case 2:
                System.out.println("You used an item.");
                context.setState(new BattlingState());
                break;
            case 3:
                context.setState(new ExploringState());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                context.setState(new BattlingState());
                break;
        }
    }
}
