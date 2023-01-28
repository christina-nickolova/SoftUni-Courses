import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArray.length; i++) {

            for (int j = i + 1; j < numbersArray.length; j++) {

                if (numbersArray[i] + numbersArray[j] == magicNumber) {
                    System.out.println(numbersArray[i] + " " + numbersArray[j]);
                }
            }
        }
    }
}
