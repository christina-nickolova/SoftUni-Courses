import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readIntArray(scanner);
        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        String[][] matrix = new String[matrixRows][matrixCols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readStringArray(scanner);
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            if (!tokens[0].equals("swap") || tokens.length != 5) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }
            //"swap row1 col1 row2c col2"
            int firstRow = Integer.parseInt(tokens[1]);
            int firstCol = Integer.parseInt(tokens[2]);
            int secondRow = Integer.parseInt(tokens[3]);
            int secondCol = Integer.parseInt(tokens[4]);

            if (isInRange(matrix, firstRow) || isInRange(matrix, firstCol) ||
                    isInRange(matrix, secondRow) || isInRange(matrix, secondCol)) {
                String firstValue = matrix[firstRow][firstCol];
                String secondValue = matrix[secondRow][secondCol];
                matrix[firstRow][firstCol] = secondValue;
                matrix[secondRow][secondCol] = firstValue;
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static String[] readStringArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }

    private static boolean isInRange(String[][] matrix, int index) {
        return index >= 0 && index < matrix.length;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] matrixRow : matrix) {
            for (String text : matrixRow) {
                System.out.print(text + " ");
            }
            System.out.println();
        }
    }
}
