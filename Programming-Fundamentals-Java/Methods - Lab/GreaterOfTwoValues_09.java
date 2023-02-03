import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNumberInput = Integer.parseInt(scanner.nextLine());
                int secondNumberInput = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(firstNumberInput, secondNumberInput));
                break;
            case "char":
                char firstCharInput = scanner.nextLine().charAt(0);
                char secondCharInput = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstCharInput, secondCharInput));
                break;
            case "string":
                String firstTextInput = scanner.nextLine();
                String secondTextInput = scanner.nextLine();

                System.out.println(getMax(firstTextInput, secondTextInput));
                break;
        }
    }

    public static int getMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public static char getMax(char firstChar, char secondChar) {

        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    public static String getMax(String firstText, String secondText) {

        if (firstText.compareTo(secondText) > 0) {
            return firstText;
        } else {
            return secondText;
        }
    }
}
