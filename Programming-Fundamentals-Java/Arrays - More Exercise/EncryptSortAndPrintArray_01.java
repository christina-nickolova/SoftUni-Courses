import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberOfStrings];

        for (int i = 0; i < array.length; i++) {
            String currentString = scanner.nextLine();
            int result = 0;

            for (int j = 0; j < currentString.length(); j++) {
                char currentLetter = currentString.charAt(j);
                int currentEncryption;

                if (currentLetter == 'a' || currentLetter == 'A'
                        || currentLetter == 'e' || currentLetter == 'E'
                        || currentLetter == 'i' || currentLetter == 'I'
                        || currentLetter == 'o' || currentLetter == 'O'
                        || currentLetter == 'u' || currentLetter == 'U') {
                    currentEncryption = currentLetter * currentString.length();
                } else {
                    currentEncryption = currentLetter / currentString.length();
                }
                result = result + currentEncryption;
            }
            array[i] = result;
        }
        Arrays.sort(array);

        for (int element : array) {
            System.out.println(element);
        }
    }
}
