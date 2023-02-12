import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> sumNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.size() == 1) {
                sumNumbers.add(numbers.get(0));
                break;
            }
            sumNumbers.add(numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(i);
            numbers.remove(numbers.size() - 1);
            i = -1;
        }
        System.out.println(sumNumbers.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}
