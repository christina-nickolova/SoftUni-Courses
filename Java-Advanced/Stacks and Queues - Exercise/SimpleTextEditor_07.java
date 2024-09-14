import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < commandsCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String command = input[0];

            switch (command) {
                case "1":
                    String string = input[1];
                    text.append(string);
                    stack.push(String.valueOf(text));
                    break;
                case "2":
                    int count = Integer.parseInt(input[1]);
                    text.delete(text.length() - count, text.length());
                    stack.push(String.valueOf(text));
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    stack.pop();

                    if (!stack.isEmpty()) {
                        text = new StringBuilder(stack.peek());
                    } else {
                        text = new StringBuilder();
                    }
                    break;
            }
        }
    }
}
