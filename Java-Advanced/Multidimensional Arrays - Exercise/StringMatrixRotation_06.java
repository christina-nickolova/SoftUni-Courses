import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotateDegrees = scanner.nextLine().
                replace("(", " ").
                replace(")", "").
                split("\\s+");
        int degrees = Integer.parseInt(rotateDegrees[1]);
        int angle = degrees % 360;

        String input = scanner.nextLine();

        List<String> data = new ArrayList<>();

        while (!input.equals("END")) {
            data.add(input);
            input = scanner.nextLine();
        }
        int matrixRows = data.size();
        int matrixCols = getMaxLength(data);

        char[][] matrix = new char[matrixRows][matrixCols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String current = data.get(row);
                if (col >= current.length()) {
                    matrix[row][col] = ' ';
                } else {
                    matrix[row][col] = current.charAt(col);
                }
            }
        }

        switch (angle) {
            case 90:
                matrix = rotateMatrix(matrix, matrixRows, matrixCols);
                break;
            case 180:
                matrix = rotateMatrix(matrix, matrixRows, matrixCols);
                matrix = rotateMatrix(matrix, matrixCols, matrixRows);
                break;
            case 270:
                matrix = rotateMatrix(matrix, matrixRows, matrixCols);
                matrix = rotateMatrix(matrix, matrixCols, matrixRows);
                matrix = rotateMatrix(matrix, matrixRows, matrixCols);
                break;
        }
        printMatrix(matrix);
    }

    private static int getMaxLength(List<String> list) {
        int maxLength = Integer.MIN_VALUE;

        for (String text : list) {
            int currentLength = text.length();

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    private static char[][] rotateMatrix(char[][] matrix, int rows, int cols) {
        char[][] rotatedMatrix = new char[cols][rows];

        for (int row = 0; row < rotatedMatrix.length; row++) {
            for (int col = 0; col < rotatedMatrix[row].length; col++) {
                rotatedMatrix[row][col] = matrix[matrix.length - 1 - col][row];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] matrixRow : matrix) {
            for (char symbol : matrixRow) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
