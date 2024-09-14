import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> queue = new ArrayDeque<>();
        queue.offer(1L);
        queue.offer(1L);

        if (number == 0) {
            System.out.println(0);
            return;
        } else if (number == 1) {
            System.out.println(1);
            return;
        }

        while (number > 0 && queue.size() > 1) {
            long sum = queue.poll() + queue.peek();
            queue.offer(sum);
            number--;
        }
        System.out.println(queue.peek());
    }
}
