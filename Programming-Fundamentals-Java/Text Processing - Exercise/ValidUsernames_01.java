import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String currentUsername : usernames) {
            boolean isValid = true;

            if (currentUsername.length() >= 3 && currentUsername.length() <= 16) {

                for (char symbol : currentUsername.toCharArray()) {

                    if (!(Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == '-' || symbol == '_')) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    System.out.println(currentUsername);
                }
            }
        }
    }
}
