import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber.replaceAll("0", "").isEmpty() || secondNumber == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder result = new StringBuilder();
        int remain = 0;

        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(String.valueOf(firstNumber.charAt(i)));
            int currentMultiply = currentDigit * secondNumber + remain;
            result.insert(0, currentMultiply % 10);
            remain = currentMultiply / 10;
        }

        if (remain != 0) {
           result.insert(0, remain);
        }
        int firstZero = result.indexOf("0");

        while (firstZero == 0) {
            result.replace(firstZero, firstZero + 1, "");
            firstZero = result.indexOf("0");
        }
        System.out.println(result);
    }
}
