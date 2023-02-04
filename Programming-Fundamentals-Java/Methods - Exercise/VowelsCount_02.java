import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printVowelsCount(textInput);
    }

    public static void printVowelsCount(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter == 'a' || currentLetter == 'A'
                    || currentLetter == 'e' || currentLetter == 'E'
                    || currentLetter == 'i' || currentLetter == 'I'
                    || currentLetter == 'o' || currentLetter == 'O'
                    || currentLetter == 'u' || currentLetter == 'U') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
