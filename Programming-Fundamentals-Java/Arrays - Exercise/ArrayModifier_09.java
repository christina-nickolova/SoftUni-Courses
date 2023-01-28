import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] inputArray = scanner.nextLine().split(" ");

        while (!inputArray[0].equals("end")) {
            String command = inputArray[0];

            if (command.equals("swap")) {
                int firstIndex = Integer.parseInt(inputArray[1]);
                int secondIndex = Integer.parseInt(inputArray[2]);

                int currentElement = numbersArray[firstIndex];
                numbersArray[firstIndex] = numbersArray[secondIndex];
                numbersArray[secondIndex] = currentElement;
            } else if (command.equals("multiply")) {
                int firstIndex = Integer.parseInt(inputArray[1]);
                int secondIndex = Integer.parseInt(inputArray[2]);

                int multiply = numbersArray[firstIndex] * numbersArray[secondIndex];
                numbersArray[firstIndex] = multiply;
            } else if (command.equals("decrease")) {

                for (int i = 0; i < numbersArray.length; i++) {
                    numbersArray[i] -= 1;
                }
            }
            inputArray = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < numbersArray.length; i++) {

            if (i != numbersArray.length - 1) {
                System.out.print(numbersArray[i] + ", ");
            } else {
                System.out.print(numbersArray[i]);
            }
        }
    }
}
