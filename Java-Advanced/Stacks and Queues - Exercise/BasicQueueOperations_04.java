import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = readIntArray(scanner);
        int elementsToOffer = input[0];
        int elementsToPoll = input[1];
        int elementToCheck = input[2];

        int[] elements = readIntArray(scanner);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elementsToOffer; i++) {
            int currentElement = elements[i];
            queue.offer(currentElement);
        }

        for (int i = 0; i < elementsToPoll; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            int smallestElement = queue.peek();

            for (int element : queue) {

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
