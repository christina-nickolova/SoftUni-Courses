import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int newSymbol = input.charAt(i) + 3;
            result.append((char) newSymbol);
        }
        System.out.println(result);
    }
}
