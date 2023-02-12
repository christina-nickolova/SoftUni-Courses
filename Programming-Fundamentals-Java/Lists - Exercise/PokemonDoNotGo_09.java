import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int currentElement;

            if (index < 0) {
                currentElement = numbers.get(0);
                numbers.set(0, numbers.get(numbers.size() - 1));
            } else if (index >= numbers.size()) {
                currentElement = numbers.get(numbers.size() - 1);
                numbers.set(numbers.size() - 1, numbers.get(0));
            } else {
                currentElement = numbers.get(index);
                numbers.remove(index);
            }
            sum += currentElement;
            increaseOrDecreaseNumbers(numbers, currentElement);
        }
        System.out.println(sum);
    }

    public static void increaseOrDecreaseNumbers(List<Integer> list, int element) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) <= element) {
                list.set(i, list.get(i) + element);
            } else {
                list.set(i, list.get(i) - element);
            }
        }
    }
}
