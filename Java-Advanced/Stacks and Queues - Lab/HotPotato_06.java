import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(queue::offer);

        int number = Integer.parseInt(scanner.nextLine());

        while (queue.size() > 1) {

            for (int i = 1; i < number; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.peek());
    }
}
