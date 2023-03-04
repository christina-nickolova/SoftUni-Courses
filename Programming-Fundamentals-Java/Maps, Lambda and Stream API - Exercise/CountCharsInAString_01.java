import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap<Character, Integer> characters = new LinkedHashMap<>();

        for (char character : text.toCharArray()) {

            if (character == ' ') {
                continue;
            }
            characters.putIfAbsent(character, 0);
            characters.put(character, characters.get(character) + 1);
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }

    }
}
