import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] expression = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder postfix = new StringBuilder();

        for (String currentSymbol : expression) {

            if (currentSymbol.equals("(")) {
                stack.push(currentSymbol);
            } else if (currentSymbol.equals(")")) {
                appendedFromStack(stack, postfix);
            } else if (currentSymbol.equals("+") || currentSymbol.equals("-")) {

                if (!stack.isEmpty()) {

                    if (stack.peek().equals("+") || stack.peek().equals("-")) {
                        postfix.append(stack.pop()).append(" ");
                        stack.push(currentSymbol);
                    } else {
                        stack.push(currentSymbol);
                    }
                } else {
                    stack.push(currentSymbol);
                }
            } else if (currentSymbol.equals("/") || currentSymbol.equals("*")) {

                if (!stack.isEmpty()) {

                    if (stack.peek().equals("/") || stack.peek().equals("*")) {
                        postfix.append(stack.pop()).append(" ");
                        stack.push(currentSymbol);
                    } else {
                        stack.push(currentSymbol);
                    }
                } else {
                    stack.push(currentSymbol);
                }
            } else {
                postfix.append(currentSymbol).append(" ");
            }
        }
        stack.forEach(e -> postfix.append(e).append(" "));
        System.out.println(postfix);
    }

    private static void appendedFromStack(ArrayDeque<String> stack, StringBuilder postfix) {
        while (!stack.isEmpty()) {

            if (stack.contains("(")) {

                if (stack.peek().equals("(")) {
                    stack.pop();
                    continue;
                }
                postfix.append(stack.pop()).append(" ");
            } else {
                break;
            }
        }
    }
}
