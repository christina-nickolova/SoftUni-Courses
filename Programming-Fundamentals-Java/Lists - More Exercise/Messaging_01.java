import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String> text = Arrays
                .stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        StringBuilder message = new StringBuilder();

        for (int number : numbers) {
            int currentNumber = number;
            int sum = 0;

            while (currentNumber > 0) {
                int currentDigit = currentNumber % 10;
                sum = sum + currentDigit;
                currentNumber = currentNumber / 10;
            }

            while (sum >= text.size()) {
                sum = sum - text.size();
            }
            message.append(text.get(sum));
            text.remove(sum);
        }
        System.out.println(message);
    }
}
