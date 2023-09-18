import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = createMatrix(scanner);
        int[][] secondMatrix = createMatrix(scanner);

        boolean areEqual = firstMatrix.length == secondMatrix.length;

        if (areEqual) {

            for (int row = 0; row < firstMatrix.length; row++) {

                for (int column = 0; column < firstMatrix[row].length; column++) {

                    if (firstMatrix[row].length != secondMatrix[row].length) {
                        areEqual = false;
                        break;
                    }

                    if (firstMatrix[row][column] != secondMatrix[row][column]) {
                        areEqual = false;
                        break;
                    }
                }
            }
        }

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static int[][] createMatrix(Scanner scanner) {
        int[] matrixSize = readArray(scanner);

        int rows = matrixSize[0];
        int columns = matrixSize[1];

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
