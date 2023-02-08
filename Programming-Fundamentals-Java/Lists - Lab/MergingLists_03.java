import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergedNumbers = new ArrayList<>();

        for (int i = 0; i < firstNumbers.size() + secondNumbers.size(); i++) {

            if (i < firstNumbers.size()) {
                mergedNumbers.add(firstNumbers.get(i));
            }

            if (i < secondNumbers.size()) {
                mergedNumbers.add(secondNumbers.get(i));
            }
        }
        System.out.println(mergedNumbers.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}
