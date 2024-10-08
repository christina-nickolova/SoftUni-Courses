import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
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

        ArrayDeque<Integer> firstDiagonal = new ArrayDeque<>();
        ArrayDeque<Integer> secondDiagonal = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                if (row == col) {
                    firstDiagonal.offer(matrix[row][col]);
                }
            }
        }
        int counter = matrix.length;
        int currentRow = matrix.length - 1;
        int currentCol = 0;

        while (counter > 0) {
            secondDiagonal.offer(matrix[currentRow][currentCol]);
            currentRow--;
            currentCol++;
            counter--;
        }
        firstDiagonal.forEach(e -> System.out.print(e + " "));
        System.out.println();
        secondDiagonal.forEach(e -> System.out.print(e + " "));
    }
}
