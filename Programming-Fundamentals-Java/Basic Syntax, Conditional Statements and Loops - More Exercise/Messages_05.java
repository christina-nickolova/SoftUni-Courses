import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 1; i <= number; i++) {
            String currentText = scanner.nextLine();
            int currentNumber = Integer.parseInt(currentText);

            int numberOfDigits = currentText.length();
            int mainDigit = currentNumber % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + numberOfDigits - 1;

            if (currentNumber == 0) {
                message = message + " ";
            } else {
                message = message + (char) (letterIndex + 97);
            }
        }
        System.out.print(message);
    }
}
