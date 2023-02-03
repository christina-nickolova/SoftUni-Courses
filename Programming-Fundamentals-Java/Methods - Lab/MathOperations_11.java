import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        String operatorInput = scanner.nextLine();
        int secondNumberInput = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        double result = calculation(operatorInput, firstNumberInput, secondNumberInput);

        System.out.println(df.format(result));
    }

    public static double calculation(String operator, int firstNumber, int secondNumber) {
        double result = 0;

        switch (operator) {
            case "/":
                result = firstNumber * 1.0 / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}
