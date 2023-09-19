import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < operations; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String number = input[0];

            if (number.equals("1")) {
                String currentText = input[1];
                text.append(currentText);
                stack.push(String.valueOf(text));
            } else if (number.equals("2")) {
                int count = Integer.parseInt(input[1]);

                if (count > text.length()) {
                    text = new StringBuilder();
                } else {
                    text.delete(text.length() - count, text.length());
                    stack.push(String.valueOf(text));
                }
            } else if (number.equals("3")) {
                int index = Integer.parseInt(input[1]);
                String element = text.substring(index - 1, index);
                System.out.println(element);
            } else if (number.equals("4")) {
                stack.pop();

                if (stack.isEmpty()) {
                    text =new StringBuilder();
                } else {
                    text = new StringBuilder(stack.peek());
                }
            }
        }
    }
}
