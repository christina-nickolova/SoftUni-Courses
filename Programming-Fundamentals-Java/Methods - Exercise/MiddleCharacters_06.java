import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printMiddleChar(textInput);
    }

    public static void printMiddleChar(String text) {
        char result;

        if (text.length() % 2 == 0) {
            result = text.charAt(text.length() / 2 - 1);
            System.out.print(result);
        }
        result = text.charAt(text.length() / 2);
        System.out.println(result);
    }
}
