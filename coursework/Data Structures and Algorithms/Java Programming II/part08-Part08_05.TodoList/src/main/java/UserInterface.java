import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                todoList.add(scanner.nextLine());
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                todoList.remove(Integer.valueOf(scanner.nextLine()));
            }
        }
    }
}
