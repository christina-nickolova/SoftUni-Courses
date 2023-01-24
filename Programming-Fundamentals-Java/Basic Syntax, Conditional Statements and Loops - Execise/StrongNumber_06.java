import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumFact = 0;
        int currentNumber = number;

        while (currentNumber > 0) {
            int currentDigit = currentNumber % 10;

            int currentFact = 1;

            for (int i = 1; i <= currentDigit; i++) {
                currentFact = currentFact * i;
            }
            sumFact = sumFact + currentFact;

            currentNumber = currentNumber / 10;
        }

        if (sumFact == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
