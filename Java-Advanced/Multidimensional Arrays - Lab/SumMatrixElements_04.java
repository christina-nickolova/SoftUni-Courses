import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
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
        System.out.println(matrixRows);
        System.out.println(matrixCols);

        int sum = 0;

        for (int[] row : matrix) {

            for (int number : row) {
                sum += number;
            }
        }
        System.out.println(sum);
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
