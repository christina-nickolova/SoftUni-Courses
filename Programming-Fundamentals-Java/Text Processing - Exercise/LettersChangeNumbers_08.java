import java.math.BigDecimal;
import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        BigDecimal sum = new BigDecimal(0);

        for (String currentString : strings) {
            char firstLetter = currentString.charAt(0);
            char lastLetter = currentString.charAt(currentString.length() - 1);
            int number = Integer.parseInt(currentString
                    .replace(firstLetter, ' ')
                    .replace(lastLetter, ' ')
                    .trim());
            BigDecimal result = new BigDecimal(0);
            int position;

            if (Character.isUpperCase(firstLetter)) {
                position = getLetterPosition(firstLetter, 65, 90);
                result = BigDecimal.valueOf(number * 1.0 / position);
            } else if (Character.isLowerCase(firstLetter)) {
                position = getLetterPosition(firstLetter, 97, 122);
                result = BigDecimal.valueOf((long) number * position);
            }

            if (Character.isUpperCase(lastLetter)) {
                position = getLetterPosition(lastLetter, 65, 90);
                result = result.subtract(BigDecimal.valueOf(position));
            } else if (Character.isLowerCase(lastLetter)) {
                position = getLetterPosition(lastLetter, 97, 122);
                result = result.add(BigDecimal.valueOf(position));
            }
            sum = sum.add(result);
        }
        System.out.printf("%.2f", sum);
    }

    public static int getLetterPosition(char letter, int start, int end) {
        int position = 0;

        for (int i = start; i <= end; i++) {
            position++;

            if (letter == i) {
                break;
            }
        }
        return position;
    }
}
