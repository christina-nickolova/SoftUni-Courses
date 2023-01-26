import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;

        for (int i = 0; i < numbersArray.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbersArray[j];
            }

            for (int j = i + 1; j < numbersArray.length; j++) {
                rightSum += numbersArray[j];
            }

            if (leftSum == rightSum) {
                isFound = true;
                System.out.println(i);
            }
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
