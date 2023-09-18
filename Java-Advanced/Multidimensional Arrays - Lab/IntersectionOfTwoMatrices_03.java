import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = createMatrix(rows, cols);
        fillMatrix(scanner, firstMatrix);

        String[][] secondMatrix = createMatrix(rows, cols);
        fillMatrix(scanner, secondMatrix);

        String[][] thirdMatrix = createMatrix(rows, cols);

        for (int row = 0; row < firstMatrix.length; row++) {

            for (int col = 0; col < firstMatrix[row].length; col++) {
                String firstMatrixSymbol = firstMatrix[row][col];
                String secondMatrixSymbol = secondMatrix[row][col];

                if (firstMatrixSymbol.equals(secondMatrixSymbol)) {
                    thirdMatrix[row][col] = firstMatrixSymbol;
                } else {
                    thirdMatrix[row][col] = "*";
                }
            }
        }

        for (String[] row : thirdMatrix) {

            for (String symbol : row) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    private static String[][] createMatrix(int rows, int cols) {
        return new String[rows][cols];
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
