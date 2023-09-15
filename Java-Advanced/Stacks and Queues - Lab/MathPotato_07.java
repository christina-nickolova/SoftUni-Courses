import java.util.*;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> queue = new PriorityQueue<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(queue::offer);

        int number = Integer.parseInt(scanner.nextLine());

        int cycle = 1;

        while (queue.size() > 1) {

            for (int i = 0; i < number; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.peek());
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
