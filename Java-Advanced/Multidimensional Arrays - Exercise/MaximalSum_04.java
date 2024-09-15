import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readIntArray(scanner);
        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        int[][] matrix = new int[matrixRows][matrixCols];

        for (int i = 0; i < matrix.length; i++) {
            int[] matrixRow = readIntArray(scanner);
            matrix[i] = matrixRow;
        }
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = 0;

                for (int currentRow = row; currentRow < row + 3; currentRow++) {
                    for (int currentCol = col; currentCol < col + 3; currentCol++) {
                        sum += matrix[currentRow][currentCol];
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        for (int row = rowIndex; row < rowIndex + 3; row++) {
            for (int col = colIndex; col < colIndex + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
