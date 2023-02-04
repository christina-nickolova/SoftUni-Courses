import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberInput; i++) {

            if (isSumOfDigitsDivisibleByEight(i) && hasOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSumOfDigitsDivisibleByEight(int number) {
        int currentNumber = number;
        int sumOfDigits = 0;

        while (currentNumber > 0) {
            int currentDigit = currentNumber % 10;
            sumOfDigits += currentDigit;

            currentNumber = currentNumber / 10;
        }
        return sumOfDigits % 8 == 0;
    }

    public static boolean hasOddDigit(int number) {
        int currentNumber = number;

        while (currentNumber > 0) {
            int currentDigit = currentNumber % 10;

            if (currentDigit % 2 != 0) {
                return true;
            }
            currentNumber = currentNumber / 10;
        }
        return false;
    }
}
