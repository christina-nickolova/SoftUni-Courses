import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();

            if (command.equals("2")) {
                stack.pop();
            } else if (command.equals("3")) {
                System.out.println(Collections.max(stack));
            } else {
                String[] commandParts = command.split("\\s+");
                int number = Integer.parseInt(commandParts[1]);
                stack.push(number);
            }
        }
    }
}
