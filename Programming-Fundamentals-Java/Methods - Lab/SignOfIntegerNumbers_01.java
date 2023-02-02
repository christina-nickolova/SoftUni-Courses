import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNumberSign(number);
    }

    public static void printNumberSign(int integer) {
        String numberSign = "";

        if (integer > 0) {
            numberSign = "positive";
        } else if (integer < 0) {
            numberSign = "negative";
        } else {
            numberSign = "zero";
        }

        System.out.printf("The number %d is %s.%n", integer, numberSign);
    }
}
