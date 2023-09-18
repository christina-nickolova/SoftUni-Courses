import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = readIntArray(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readIntArray(scanner);
        }

        int[][] subMatrix = new int[2][2];

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {

            for (int col = 0; col < matrix[row].length - 1; col++) {

                int upperLeft = matrix[row][col];
                int upperRight = matrix[row][col + 1];
                int downLeft = matrix[row + 1][col];
                int downRight = matrix[row + 1][col + 1];

                int currentSum = upperLeft + upperRight + downLeft + downRight;

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    subMatrix[0][0] = upperLeft;
                    subMatrix[0][1] = upperRight;
                    subMatrix[1][0] = downLeft;
                    subMatrix[1][1] = downRight;
                }
            }
        }

        for (int[] array : subMatrix) {

            for (int integer : array) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
