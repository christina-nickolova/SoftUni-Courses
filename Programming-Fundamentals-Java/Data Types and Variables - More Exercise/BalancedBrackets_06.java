import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfLines = Byte.parseByte(scanner.nextLine());

        int leftBracketsCount = 0;
        int rightBracketsCount = 0;
        boolean isBalanced = false;
        int counter = 0;

        for (int i = 0; i < numberOfLines; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                leftBracketsCount++;

                if (leftBracketsCount == 2 && rightBracketsCount == 0) {
                    counter++;
                }
            } else if (input.equals(")")) {
                rightBracketsCount++;

                if (leftBracketsCount == 0) {
                    counter++;
                }
            }

            if (leftBracketsCount == 1 && rightBracketsCount == 1) {
                leftBracketsCount = 0;
                rightBracketsCount = 0;
            }
        }

        if (leftBracketsCount == rightBracketsCount) {

            if (counter == 0) {
                isBalanced = true;
            }
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
