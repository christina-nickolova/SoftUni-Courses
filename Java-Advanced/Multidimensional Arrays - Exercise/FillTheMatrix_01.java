import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(",\\s+");
        int dimensions = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix = new int[dimensions][dimensions];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix);
        } else {
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {

            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {

            if (col % 2 != 0) {

                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {

                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {

        for (int[] matrixRow : matrix) {

            for (int number : matrixRow) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
