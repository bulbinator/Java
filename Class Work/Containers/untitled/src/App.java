import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("Press 1 for container 1, press 2 for container 2. Type 'Quit' to exit");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }

            int containerNum = Integer.parseInt(input);
            Container container;
            Container alt;

            if (containerNum == 1) {
                container = container1;
                alt = container2;
            }
            else {
                container = container2;
                alt = container1;
            }

            System.out.println("To add liters type 'add'. To remove liters type 'remove'. To move liters type 'move'.");
            String function = scanner.nextLine();

            switch (function) {
                case "add":
                    System.out.println("How many liters would you like to add?");
                    int add = Integer.parseInt(scanner.nextLine());
                    container.addLiters(add);
                    break;

                case "remove":
                    System.out.println("How many liters would you like to remove?");
                    int remove = Integer.parseInt(scanner.nextLine());
                    container.removeLiters(remove);
                    break;

                case "move":
                    System.out.println("How many liters would you like to move?");
                    int move = Integer.parseInt(scanner.nextLine());
                    container.addLiters(move);
                    alt.removeLiters(move);
                    break;
            }

            System.out.println("Container 1 has " + container1.getLiters() + "/500 liters.");
            System.out.println("Container 2 has " + container2.getLiters() + "/500 liters.");
        }
    }
}
