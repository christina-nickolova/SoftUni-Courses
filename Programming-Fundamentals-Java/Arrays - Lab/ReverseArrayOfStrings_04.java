import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsArray = scanner.nextLine().split(" ");

        for (int i = 0; i < stringsArray.length / 2; i++) {
            String currentElement = stringsArray[i];

            stringsArray[i] = stringsArray[stringsArray.length - 1 - i];
            stringsArray[stringsArray.length - 1 - i] = currentElement;
        }
        System.out.println(String.join(" ", stringsArray));
    }
}
