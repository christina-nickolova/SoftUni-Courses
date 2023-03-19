import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String message = scanner.nextLine();
            String regex = "[STARstar]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(message);
            int count = 0;

            while (matcher.find()) {
                count++;
            }
            StringBuilder decryptedMessage = new StringBuilder();

            for (char character : message.toCharArray()) {
                character -= count;
                decryptedMessage.append(character);
            }
            regex = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planet = matcher.group("planet");
                String attackType = matcher.group("attackType");

                if (attackType.matches("A")) {
                    attackedPlanets.add(planet);
                } else if (attackType.matches("D")) {
                    destroyedPlanets.add(planet);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
    }
}
