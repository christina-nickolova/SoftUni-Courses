import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            symbols.putIfAbsent(symbol, 0);
            symbols.put(symbol, symbols.get(symbol) + 1);
        }
        symbols.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));
    }
}
