import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = readIntArray(scanner);
        int elementsToPush = input[0];
        int elementsToPop = input[1];
        int elementToCheck = input[2];

        int[] elements = readIntArray(scanner);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            int currentElement = elements[i];
            stack.push(currentElement);
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            int smallestElement = stack.peek();

            for (int element : stack) {

                if (smallestElement > element) {
                    smallestElement = element;
                }
            }
            System.out.println(smallestElement);
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
