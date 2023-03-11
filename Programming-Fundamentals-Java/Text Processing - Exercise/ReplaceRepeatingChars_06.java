import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        char prevSymbol = ' ';

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol != prevSymbol) {
                result.append(currentSymbol);
            }
            prevSymbol = currentSymbol;
        }
        System.out.println(result);
    }
}
