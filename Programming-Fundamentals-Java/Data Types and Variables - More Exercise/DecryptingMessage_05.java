import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());
        byte numberOfLines = Byte.parseByte(scanner.nextLine());

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numberOfLines; i++) {
            char letter = scanner.nextLine().charAt(0);

            int currentLetter = letter + key;
            message.append((char) currentLetter);
        }
        System.out.println(message);
    }
}
