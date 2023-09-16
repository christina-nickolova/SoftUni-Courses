import java.util.*;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = integers[0];
        int s = integers[1];
        int x = integers[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            int currentNumber = numbers[i];
            stack.push(currentNumber);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.size() == 0) {
            System.out.println("0");
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
