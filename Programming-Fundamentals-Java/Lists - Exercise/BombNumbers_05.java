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
        String[] inputParts = scanner.nextLine().split(" ");

        int bombNumber = Integer.parseInt(inputParts[0]);
        int power = Integer.parseInt(inputParts[1]);

        while (numbers.contains(bombNumber)) {
            int index = numbers.indexOf(bombNumber);

            int left = Math.max(0, index - power);
            int right = Math.min(index + power, numbers.size() - 1);

            if (right >= left) {
                numbers.subList(left, right + 1).clear();
            }
        }
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
