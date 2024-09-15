import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[dimensions][dimensions];

        for (int i = 0; i < matrix.length; i++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = matrixRow;
        }
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                if (row == col) {
                    sumFirstDiagonal += matrix[row][col];
                }
            }
        }
        int counter = matrix.length;
        int currentRow = matrix.length - 1;
        int currentCol = 0;

        while (counter > 0) {
            sumSecondDiagonal += matrix[currentRow][currentCol];
            currentRow--;
            currentCol++;
            counter--;
        }
        System.out.println(Math.abs(sumFirstDiagonal - sumSecondDiagonal));
    }
}
