import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted(Integer::compareTo)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        if (numbers.size() <= 3) {
            System.out.println(numbers.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        } else {

            for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
