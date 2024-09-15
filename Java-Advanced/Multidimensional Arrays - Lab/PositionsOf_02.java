import java.util.Arrays;
import java.util.Scanner;

public class PositionOf_02 {
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
        int number = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];

                if (currentNumber == number) {
                    isFound = true;
                    System.out.println(row + " " + col);
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}