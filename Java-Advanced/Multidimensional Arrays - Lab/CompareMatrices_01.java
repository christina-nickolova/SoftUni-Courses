import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstMatrixDimensions = readIntArray(scanner);
        int firstMatrixRows = firstMatrixDimensions[0];
        int firstMatrixCols = firstMatrixDimensions[1];

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];
        fillMatrix(firstMatrixRows, scanner, firstMatrix);

        int[] secondMatrixDimensions = readIntArray(scanner);
        int secondMatrixRows = secondMatrixDimensions[0];
        int secondMatrixCols = secondMatrixDimensions[1];

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];
        fillMatrix(secondMatrixRows, scanner, secondMatrix);

        if (areMatricesEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean areMatricesEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {

            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }

            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillMatrix(int matrixRows, Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrixRows; i++) {
            int[] matrixRow = readIntArray(scanner);
            matrix[i] = matrixRow;
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
