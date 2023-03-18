import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        List<String> validNumbers = new ArrayList<>();
        String regex = "\\+359(?<delimiter>[ -])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);

        while (matcher.find()) {
            validNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", validNumbers));
    }
}
