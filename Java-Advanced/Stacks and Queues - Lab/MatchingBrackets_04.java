import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int index = 0; index < expression.length(); index++) {
            char currentSymbol = expression.charAt(index);

            if (currentSymbol == '(') {
                stack.push(index);
            } else if (currentSymbol == ')') {
                String substring = expression.substring(stack.pop(), index + 1);
                System.out.println(substring);
            }
        }
    }
}
