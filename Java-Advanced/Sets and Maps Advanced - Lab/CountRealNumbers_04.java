import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        LinkedHashMap<Double, Integer> occurrences = new LinkedHashMap<>();

        for (double number : numbers) {
            occurrences.putIfAbsent(number, 0);

            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
