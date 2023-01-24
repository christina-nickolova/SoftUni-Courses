import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char firstLetter = 'a'; firstLetter < 'a' + number; firstLetter++) {

            for (char secondLetter = 'a'; secondLetter < 'a' + number; secondLetter++) {

                for (char thirdLetter = 'a'; thirdLetter < 'a' + number; thirdLetter++) {
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }
    }
}
