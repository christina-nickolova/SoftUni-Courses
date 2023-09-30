import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lengths = scanner.nextLine().split("\\s+");
        int firstSetLength = Integer.parseInt(lengths[0]);
        int secondSetLength = Integer.parseInt(lengths[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength + secondSetLength; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i < firstSetLength) {
                firstSet.add(number);
            } else {
                secondSet.add(number);
            }
        }

        while (Math.min(firstSet.size(), secondSet.size()) > 0) {
            int number;

            if (firstSet.size() <= secondSet.size()) {
                number = firstSet.iterator().next();
                firstSet.remove(number);

                if (secondSet.contains(number)) {
                    System.out.print(number + " ");
                }
            } else {
                number = secondSet.iterator().next();
                secondSet.remove(number);

                if (firstSet.contains(number)) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
