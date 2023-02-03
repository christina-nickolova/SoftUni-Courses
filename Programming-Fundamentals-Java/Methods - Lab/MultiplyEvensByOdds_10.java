import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(numberInput));
    }

    public static int getMultipleOfEvensAndOdds(int number) {
        return getSumEvenDigits(number) * getSumOddDigits(number);
    }

    public static int getSumEvenDigits(int number) {
        number = Math.abs(number);
        int evenSum = 0;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit % 2 == 0) {
                evenSum += currentDigit;
            }
            number = number / 10;
        }
        return evenSum;
    }

    public static int getSumOddDigits(int number) {
        number = Math.abs(number);
        int oddSum = 0;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit % 2 != 0) {
                oddSum += currentDigit;
            }
            number = number / 10;
        }
        return oddSum;
    }
}
