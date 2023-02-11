import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        int bombNumber = Integer.parseInt(input.split(" ")[0]);
        int power = Integer.parseInt(input.split(" ")[1]);
        int bombNumberIndex = numbers.indexOf(bombNumber);
        int counter = 0;

        for (int i = 0; i < bombNumberIndex; i++) {
            numbers.remove(bombNumberIndex - 1 - i);
            counter++;

            if (counter == power) {
                break;
            }
        }
        bombNumberIndex = numbers.indexOf(bombNumber);

        for (int i = bombNumberIndex; i < numbers.size() - 1; i++) {
            numbers.remove(i + 1);
            counter++;

            if (counter == power) {
                break;
            }
        }
        numbers.remove(Integer.valueOf(bombNumber));
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
