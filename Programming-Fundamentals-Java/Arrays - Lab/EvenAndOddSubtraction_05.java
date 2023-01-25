import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int element : numbersArray) {

            if (element % 2 == 0) {
                evenSum += element;
            } else {
                oddSum += element;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
