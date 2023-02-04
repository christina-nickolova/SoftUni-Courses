import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());

        double firstNumFactorial = getFactorial(firstNumberInput);
        double secondNumFactorial = getFactorial(secondNumberInput);
        double result = firstNumFactorial / secondNumFactorial;

        System.out.printf("%.2f", result);
    }

    public static long getFactorial(int number) {
        long factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
