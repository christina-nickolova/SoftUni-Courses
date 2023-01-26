import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        String[] firstNumbersArray = new String[numberOfLines];
        String[] secondNumbersArray = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            String[] input = scanner.nextLine().split(" ");

            if ((i + 1) % 2 != 0) {
                firstNumbersArray[i] = input[0];
                secondNumbersArray[i] = input[1];
            } else {
                firstNumbersArray[i] = input[1];
                secondNumbersArray[i] = input[0];
            }
        }
        System.out.println(String.join(" ", firstNumbersArray));
        System.out.println(String.join(" ", secondNumbersArray));
    }
}
