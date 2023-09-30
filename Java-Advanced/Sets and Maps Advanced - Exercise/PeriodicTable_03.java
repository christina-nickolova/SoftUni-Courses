import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 0; i < number; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(elements));
        }
        chemicalElements.forEach(e -> System.out.print(e + " "));
    }
}
