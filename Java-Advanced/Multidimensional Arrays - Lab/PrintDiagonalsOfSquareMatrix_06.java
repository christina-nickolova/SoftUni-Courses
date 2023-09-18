import java.util.*;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];

                if (row == col) {
                    firstDiagonal.add(currentNumber);
                }

                if (row + col == matrixSize - 1) {
                    secondDiagonal.add(currentNumber);
                }
            }
        }
        Collections.reverse(secondDiagonal);
        Arrays.stream(firstDiagonal.toArray()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(secondDiagonal.toArray()).forEach(e -> System.out.print(e + " "));
    }
}
