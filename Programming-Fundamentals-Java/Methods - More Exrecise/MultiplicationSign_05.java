import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());
        int thirdNumberInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultiplicationSign(firstNumberInput, secondNumberInput, thirdNumberInput));
    }

    public static String getMultiplicationSign(int firstNumber, int secondNumber, int thirdNumber) {
        int[] numbersArray = new int[]{firstNumber, secondNumber, thirdNumber};
        int counter = 0;

        for (int element : numbersArray) {

            if (element == 0) {
                return "zero";
            } else {

                if (element < 0) {
                    counter++;
                }
            }
        }

        if (counter == 0 || counter == 2) {
            return "positive";
        } else {
            return "negative";
        }
    }
}
