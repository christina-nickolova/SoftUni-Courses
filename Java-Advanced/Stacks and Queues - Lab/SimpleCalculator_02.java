import java.util.*;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] expression = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, expression);

        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            if (operator.equals("+")) {
                stack.push(String.valueOf(firstNumber + secondNumber));
            } else if (operator.equals("-")) {
                stack.push(String.valueOf(firstNumber - secondNumber));
            }
        }
        System.out.println(stack.peek());
    }
}
