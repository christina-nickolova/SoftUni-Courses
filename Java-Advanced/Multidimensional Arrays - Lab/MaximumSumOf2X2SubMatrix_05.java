import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = readIntArray(scanner);
        int matrixRows = dimension[0];
        int matrixCols = dimension[1];

        int[][] matrix = new int[matrixRows][matrixCols];

        for (int row = 0; row < matrix.length; row++) {
            int[] matrixRow = readIntArray(scanner);
            matrix[row] = matrixRow;
        }

        int[][] subMatrix = new int[2][2];

        int maxSum = 0;

        for (int row = 0; row < matrix.length - 1; row++) {

            for (int col = 0; col < matrix[row].length - 1; col++) {
                int upperLeft = matrix[row][col];
                int upperRight = matrix[row][col + 1];
                int downLeft = matrix[row + 1][col];
                int downRight = matrix[row + 1][col + 1];

                int sum = upperLeft + upperRight + downLeft + downRight;

                if (sum > maxSum) {
                    maxSum = sum;
                    subMatrix[0][0] = upperLeft;
                    subMatrix[0][1] = upperRight;
                    subMatrix[1][0] = downLeft;
                    subMatrix[1][1] = downRight;
                }
            }
        }

        for (int[] row : subMatrix) {

            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

