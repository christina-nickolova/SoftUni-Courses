import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);

            System.out.println(isPalindrome(number));

            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(int number) {
        StringBuilder numBackward = new StringBuilder();
        int currentNumber = number;

        while (currentNumber > 0) {
            int currentDigit = currentNumber % 10;
            numBackward.append(currentDigit);
            currentNumber = currentNumber / 10;
        }
        int numberBackward = Integer.parseInt(String.valueOf(numBackward));

        return number == numberBackward;
    }
}
