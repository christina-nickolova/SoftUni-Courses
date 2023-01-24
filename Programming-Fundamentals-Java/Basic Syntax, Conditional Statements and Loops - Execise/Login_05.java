import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentLetter = username.charAt(i);
            password = password + currentLetter;
        }
        String currentPassword = scanner.nextLine();

        int counter = 0;
        boolean isBlocked = false;

        while (!currentPassword.equals(password)) {
            counter++;

            if (counter == 4) {
                isBlocked = true;
                System.out.printf("User %s blocked!%n", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            currentPassword = scanner.nextLine();
        }

        if (!isBlocked) {
            System.out.printf("User %s logged in.%n", username);
        }
    }
}
