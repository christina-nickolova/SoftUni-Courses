import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        String regex = "(?<symbols>[\\D]+)(?<numbers>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String sequence = matcher.group("symbols");
            int count = Integer.parseInt(matcher.group("numbers"));

            while (count > 0) {
                result.append(sequence);
                count--;
            }
        }
        List<Character> uniqueSymbols = new ArrayList<>();

        for (char symbol : result.toString().toCharArray()) {

            if (!uniqueSymbols.contains(symbol)) {
                uniqueSymbols.add(symbol);
            }
        }
        System.out.printf("Unique symbols used: %d\n", uniqueSymbols.size());
        System.out.println(result);
    }
}
