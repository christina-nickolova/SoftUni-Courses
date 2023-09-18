import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = readIntArray(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readIntArray(scanner);
            sum += sumIntegers(matrix[row]);
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int sumIntegers(int[] array) {
        int sum = 0;

        for (int integer : array) {
            sum += integer;
        }
        return sum;
    }
}
