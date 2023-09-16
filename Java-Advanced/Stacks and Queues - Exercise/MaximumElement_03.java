import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < number; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (input[0] == 1) {
                stack.push(input[1]);
            } else if (input[0] == 2) {
                stack.pop();
            } else if (input[0] == 3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
