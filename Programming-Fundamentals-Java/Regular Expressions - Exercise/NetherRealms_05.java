import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("[,\\s]+");

        for (String name : names) {

            if (name.contains(" ") || name.contains(",")) {
                continue;
            }
            String regex = "[^0-9+\\-*/.]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            int health = 0;

            while (matcher.find()) {
                char symbol = matcher.group().charAt(0);
                health += symbol;
            }
            regex = "[+-]?\\d+\\.?\\d*";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);
            double damage = 0;

            while (matcher.find()) {
                double currentDamage = Double.parseDouble(matcher.group());
                damage += currentDamage;
            }
            regex = "[*/]";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);

            while (matcher.find()) {

                if (matcher.group().matches("\\*")) {
                    damage *= 2;
                } else if (matcher.group().matches("/")) {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", name, health, damage);
        }
    }
}
