import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 1 || number == 2) {
            System.out.println(1);
        } else {
            System.out.println(GetFibonacci(number));
        }
    }

    public static int GetFibonacci(int integer) {
        int firstNumber = 1;
        int secondNumber = 1;
        int fibonacciNumber = 0;

        for (int i = 0; i < integer - 2; i++) {
            fibonacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacciNumber;
        }
        return fibonacciNumber;
    }
}
