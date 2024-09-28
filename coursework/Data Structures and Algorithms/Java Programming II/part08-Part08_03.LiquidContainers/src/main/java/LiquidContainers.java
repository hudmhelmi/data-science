
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container("First");
        Container second = new Container("Second");

        while (true) {
            System.out.println(first);
            System.out.println(second);

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");

            String command = inputParts[0];
            int amount = Integer.valueOf(inputParts[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                int firstOriginalVolume = first.getVolume();
                first.remove(amount);
                second.add(firstOriginalVolume - first.getVolume());
            } else if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
