import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TakeOrSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        List<String> nonNumbers = new ArrayList<>();

        for (int i = 0; i < encryptedMessage.length(); i++) {
            char currentElement = encryptedMessage.charAt(i);

            if (currentElement >= 48 && currentElement <= 57) {
                int currentNumber = Integer.parseInt(String.valueOf(currentElement));
                numbers.add(currentNumber);
            } else {
                nonNumbers.add(String.valueOf(currentElement));
            }
        }

        StringBuilder decryptedMessage = new StringBuilder();
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);

            if (i % 2 == 0) {

                while (number > 0) {
                    decryptedMessage.append(nonNumbers.get(index));
                    index++;
                    number--;

                    if (index >= nonNumbers.size()) {
                        break;
                    }
                }
            } else {
                index += numbers.get(i);
            }
        }
        System.out.println(decryptedMessage);
    }
}
