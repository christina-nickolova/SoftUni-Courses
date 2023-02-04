import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        printPasswordValidation(password);
    }

    public static void printPasswordValidation(String password) {

        if (isInRange(password) && areOnlyLettersAndDigits(password) && areContainedTwoDigits(password)) {
            System.out.println("Password is valid");
        } else {

            if (!isInRange(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }

            if (!areOnlyLettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }

            if (!areContainedTwoDigits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean isInRange(String text) {

        return text.length() >= 6 && text.length() <= 10;
    }

    public static boolean areOnlyLettersAndDigits(String text) {
        boolean isValid = false;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter >= 48 && currentLetter <= 57
                    || currentLetter >= 65 && currentLetter <= 90
                    || currentLetter >= 97 && currentLetter <= 122) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean areContainedTwoDigits(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter >= 48 && currentLetter <= 57) {
                counter++;
            }
        }
        return counter >= 2;
    }
}
