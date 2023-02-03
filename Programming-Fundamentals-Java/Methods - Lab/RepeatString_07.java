import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int numberInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getRepeatedString(numberInput, textInput));
    }

    public static StringBuilder getRepeatedString(int number, String text) {
        StringBuilder result = new StringBuilder();

        result.append(String.valueOf(text).repeat(number));

        return result;
    }
}
