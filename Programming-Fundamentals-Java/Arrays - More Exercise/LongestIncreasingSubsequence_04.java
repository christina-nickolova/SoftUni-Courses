import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] lengthArray = new int[numbersArray.length];
        int[] previousArray = new int[numbersArray.length];
        int maxLength = 0;
        int lastIndex = -1;

        for (int i = 0; i < numbersArray.length; i++) {
            lengthArray[i] = 1;
            previousArray[i] = -1;

            for (int j = 0; j < i; j++) {

                if (numbersArray[j] < numbersArray[i] && lengthArray[j] + 1 > lengthArray[i]) {
                    lengthArray[i] = lengthArray[j] + 1;
                    previousArray[i] = j;
                }
            }

            if (lengthArray[i] > maxLength) {
                maxLength = lengthArray[i];
                lastIndex = i;
            }
        }
        int[] lisArray = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            lisArray[currentIndex] = numbersArray[lastIndex];
            currentIndex--;
            lastIndex = previousArray[lastIndex];
        }

        for (int element : lisArray) {
            System.out.print(element + " ");
        }
    }
}
