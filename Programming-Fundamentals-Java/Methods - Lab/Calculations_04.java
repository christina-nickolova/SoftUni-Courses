import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                printSum(firstNumber, secondNumber);
                break;
            case "multiply":
                printMultiply(firstNumber, secondNumber);
                break;
            case "subtract":
                printSubtraction(firstNumber, secondNumber);
                break;
            case "divide":
                printDivision(firstNumber, secondNumber);
                break;
        }
    }

    public static void printSum(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void printMultiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void printSubtraction(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void printDivision(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}
