import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        StringBuilder repeated = new StringBuilder();

        for (String currentString : strings) {
            repeated.append(currentString.repeat(currentString.length()));
        }
        System.out.println(repeated);
    }
}
