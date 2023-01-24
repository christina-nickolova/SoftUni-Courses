import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = Long.parseLong(scanner.nextLine());
        long secondNumber = Long.parseLong(scanner.nextLine());
        long thirdNumber = Long.parseLong(scanner.nextLine());
        long fourthNumber = Long.parseLong(scanner.nextLine());

        long sumFirstAndSecondNumber = firstNumber + secondNumber;
        long divideSumByThirdNumber = sumFirstAndSecondNumber / thirdNumber;
        long multiplyDivisionByFourthNumber = divideSumByThirdNumber * fourthNumber;

        System.out.println(multiplyDivisionByFourthNumber);
    }
}
