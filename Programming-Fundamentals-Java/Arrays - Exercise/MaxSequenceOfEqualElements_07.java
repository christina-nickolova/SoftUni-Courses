import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 1;
        int index = -1;

        for (int i = 0; i < numbersArray.length; i++) {

            if (i != numbersArray.length - 1) {

                if (numbersArray[i] == numbersArray[i + 1]) {
                    length++;

                    if (maxLength < length) {
                        maxLength = length;
                        index = i;
                    }
                } else {
                    length = 1;
                }
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(numbersArray[index] + " ");
        }
    }
}
