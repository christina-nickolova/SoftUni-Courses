import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());
        int thirdNumberInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getSubtraction(firstNumberInput, secondNumberInput, thirdNumberInput));
    }

    public static int getSum(int firstNum, int secondNum) {

        return firstNum + secondNum;
    }

    public static int getSubtraction(int firstNum, int secondNum, int thirdNum) {

        return getSum(firstNum, secondNum) - thirdNum;
    }
}
