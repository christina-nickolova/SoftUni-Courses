import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixRows = Integer.parseInt(scanner.nextLine());
        int matrixCols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[matrixRows][matrixCols];
        fillMatrix(firstMatrix, scanner);

        String[][] secondMatrix = new String[matrixRows][matrixCols];
        fillMatrix(secondMatrix, scanner);


        for (int row = 0; row < firstMatrix.length; row++) {

            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col].equals(secondMatrix[row][col])) {
                    System.out.print(firstMatrix[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            String[] matrixRow = readStringArray(scanner);
            matrix[i] = matrixRow;
        }
    }

    private static String[] readStringArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }
}
