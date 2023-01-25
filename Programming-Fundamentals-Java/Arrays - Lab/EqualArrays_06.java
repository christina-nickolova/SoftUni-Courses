import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondNumbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        boolean areIdentical = true;
        int diffIndex = -1;

        for (int i = 0; i < firstNumbersArray.length; i++) {

            if (firstNumbersArray[i] == secondNumbersArray[i]) {
                sum += firstNumbersArray[i];
            } else {
                areIdentical = false;
                diffIndex = i;
                break;
            }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
