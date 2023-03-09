import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        String asterisk = "*";

        for (String bannedWord : bannedWords) {
            text = text.replaceAll(bannedWord, (asterisk.repeat(bannedWord.length())));
        }
        System.out.println(text);
    }
}
