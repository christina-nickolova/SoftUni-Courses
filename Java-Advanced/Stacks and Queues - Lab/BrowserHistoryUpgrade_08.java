import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> backStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (backStack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardStack.push(backStack.pop());
                    System.out.println(backStack.peek());
                }
            } else if (input.equals("forward")) {

                if (forwardStack.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    backStack.push(forwardStack.peek());
                    System.out.println(forwardStack.pop());
                }
            } else {
                backStack.push(input);
                System.out.println(backStack.peek());
                forwardStack.clear();
            }
            input = scanner.nextLine();
        }
    }
}
