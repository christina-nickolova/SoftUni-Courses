import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCharInput = scanner.nextLine().charAt(0);
        char secondCharInput = scanner.nextLine().charAt(0);

        printCharactersInRange(firstCharInput, secondCharInput);
    }

    public static void printCharactersInRange(char firstChar, char secondChar) {

        if (firstChar < secondChar) {
            
            for (int i = firstChar + 1; i < secondChar; i++) {
                System.out.print((char) i + " ");
            }
        } else {

            for (int i = secondChar + 1; i < firstChar; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
