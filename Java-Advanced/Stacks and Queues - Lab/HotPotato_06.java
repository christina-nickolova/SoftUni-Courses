import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, players);

        int number = Integer.parseInt(scanner.nextLine());

        int rotation = 0;

        while (queue.size() > 1) {
            rotation++;

            if (rotation % number == 0) {
                System.out.println("Removed " + queue.poll());
            } else {
                String rotatedPlayer = queue.poll();
                queue.offer(rotatedPlayer);
            }
        }
        System.out.println("Last is " + queue.peek());
    }
}
