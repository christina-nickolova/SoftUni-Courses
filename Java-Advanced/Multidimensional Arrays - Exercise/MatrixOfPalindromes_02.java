import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions= readIntArray(scanner);
        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        String[][] matrix = new String[matrixRows][matrixCols];
        char first = 97;
        char second = 97;
        char third = 97;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = first + "" + second + third;
                second++;
            }
            first++;
            second = first;
            third++;
        }
        printMatrix(matrix);
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
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
