import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
