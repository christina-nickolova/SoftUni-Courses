import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printMatrix(numberInput);
    }
    
    public static void printMatrix(int number) {

        for (int i = 1; i <= number; i++) {
            printLine(number, 1, number);
            System.out.println();
        }
    }
    
    public static void printLine(int number, int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(number + " ");
        }
    }
}
