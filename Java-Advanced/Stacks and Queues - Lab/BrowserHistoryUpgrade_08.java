import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> newStack = new ArrayDeque<>();


        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (stack.size() > 1) {
                    newStack.push(stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {

                if (!newStack.isEmpty()) {
                    System.out.println(newStack.peek());
                    stack.push(newStack.pop());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                stack.push(input);
                newStack.clear();
                System.out.println(stack.peek());
            }
            input = scanner.nextLine();
        }
    }
}
