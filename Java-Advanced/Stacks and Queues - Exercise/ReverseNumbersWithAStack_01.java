import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String currentElement : input) {
            stack.push(currentElement);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
