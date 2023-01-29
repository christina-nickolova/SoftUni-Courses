import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("!+");

        int maxLength = 1;
        int bestStartIndex = -1;
        int maxSequenceSum = 0;
        int bestSequenceIndex = 0;
        int counter = 0;
        int[] bestSequenceArray = new int[sequenceLength];

        while (!input[0].equals("Clone them")) {
            int[] currentSequenceArray = new int[sequenceLength];

            for (int i = 0; i < currentSequenceArray.length; i++) {
                currentSequenceArray[i] = Integer.parseInt(input[i]);
            }
            counter++;
            int length = 1;
            int maxCurrentLength = 1;
            int startIndex = -1;
            int currentSequenceSum = 0;

            for (int i = 0; i < currentSequenceArray.length - 1; i++) {

                if (currentSequenceArray[i] == currentSequenceArray[i + 1]) {
                    length++;
                } else {
                    length = 1;
                }

                if (maxCurrentLength < length) {
                    maxCurrentLength = length;
                    startIndex = i;
                }
                currentSequenceSum += currentSequenceArray[i];
            }
            currentSequenceSum += currentSequenceArray[currentSequenceArray.length - 1];

            if (maxCurrentLength > maxLength) {
                maxLength = maxCurrentLength;
                bestStartIndex = startIndex;
                maxSequenceSum = currentSequenceSum;
                bestSequenceIndex = counter;
                bestSequenceArray = currentSequenceArray;
            } else if (maxCurrentLength == maxLength) {

                if (startIndex < bestStartIndex) {
                    bestStartIndex = startIndex;
                    maxSequenceSum = currentSequenceSum;
                    bestSequenceIndex = counter;
                    bestSequenceArray = currentSequenceArray;
                } else if (startIndex == bestStartIndex) {

                    if (currentSequenceSum > maxSequenceSum) {
                        maxSequenceSum = currentSequenceSum;
                        bestSequenceIndex = counter;
                        bestSequenceArray = currentSequenceArray;
                    }
                }
            }
            input = scanner.nextLine().split("!+");
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, maxSequenceSum);
        System.out.println(Arrays.toString(bestSequenceArray).replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}
