import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split("\\s+");

        PriorityQueue<String> queue = new PriorityQueue<>();
        Collections.addAll(queue, players);

        int number = Integer.parseInt(scanner.nextLine());

        int rotation = 0;

        while (queue.size() > 1) {
            rotation++;

            if (!isPrime(rotation) || rotation == 1) {
                System.out.println("Removed " + queue.poll());
            } else {
                String rotatedPlayer = queue.poll();
                queue.offer(rotatedPlayer);
                System.out.println("Prime " + rotatedPlayer);
            }
        }
        System.out.println("Last is " + queue.peek());
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
