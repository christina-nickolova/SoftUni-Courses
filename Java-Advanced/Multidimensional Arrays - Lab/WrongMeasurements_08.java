import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dimensions][dimensions];

        for (int i = 0; i < matrix.length; i++) {
            int[] matrixRow = readIntArray(scanner);
            matrix[i] = matrixRow;
        }
        int[] wrongNumberCoordinates = readIntArray(scanner);
        int wrongNumberRow = wrongNumberCoordinates[0];
        int wrongNumberCol = wrongNumberCoordinates[1];
        int wrongNumber = matrix[wrongNumberRow][wrongNumberCol];
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];

                if (currentNumber == wrongNumber) {

                    if (row - 1 >= 0) {

                        if (matrix[row - 1][col] != wrongNumber) {
                            sum += matrix[row - 1][col];
                        }
                    }

                    if (row + 1 < matrix.length) {

                        if (matrix[row + 1][col] != wrongNumber) {
                            sum += matrix[row + 1][col];
                        }
                    }

                    if (col - 1 >= 0) {

                        if (matrix[row][col - 1] != wrongNumber) {
                            sum += matrix[row][col - 1];
                        }
                    }

                    if (col + 1 < matrix[row].length) {

                        if (matrix[row][col + 1] != wrongNumber) {
                            sum += matrix[row][col + 1];
                        }
                    }
                    System.out.print(sum + " ");
                } else {
                    System.out.print(currentNumber + " ");
                }
                sum = 0;
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
