import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean isBalanced = true;

        for (int i = 0; i < sequence.length(); i++) {
            char current = sequence.charAt(i);

            if (current == ')') {

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                if (!stack.pop().equals('(')) {
                    isBalanced = false;
                    break;
                }
            } else if (current == '}') {

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                if (!stack.pop().equals('{')) {
                    isBalanced = false;
                    break;
                }
            } else if (current == ']') {

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                if (!stack.pop().equals('[')) {
                    isBalanced = false;
                    break;
                }
            } else {
                stack.push(current);
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
