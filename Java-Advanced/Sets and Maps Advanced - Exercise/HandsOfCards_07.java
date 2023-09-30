import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            List<String> cards = Arrays.stream(tokens[1].split(",\\s+")).collect(Collectors.toList());
            players.putIfAbsent(name, new HashSet<>());
            players.get(name).addAll(cards);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : players.entrySet()) {
            String name = entry.getKey();
            Set<String> playerCards = entry.getValue();
            int value = calculateValue(playerCards);
            System.out.println(name + ": " + value);
        }
    }

    private static int calculateValue(Set<String> set) {
        int value = 0;

        while (set.size() > 0) {
            String card = set.iterator().next();
            set.remove(card);
            int currentPower = getPower(card);
            int currentType = getType(card);
            value += currentPower * currentType;
        }
        return value;
    }

    private static int getType(String text) {
        int type = 0;
        String symbol = String.valueOf(text.charAt(text.length() - 1));

        if (symbol.equals("S")) {
            type = 4;
        } else if (symbol.equals("H")) {
            type = 3;
        } else if (symbol.equals("D")) {
            type = 2;
        } else if (symbol.equals("C")) {
            type = 1;
        }
        return type;
    }

    private static int getPower(String text) {
        int power;

        String symbol = String.valueOf(text.charAt(0));

        if (text.length() == 2) {

            if (symbol.equals("J")) {
                power = 11;
            } else if (symbol.equals("Q")) {
                power = 12;
            } else if (symbol.equals("K")) {
                power = 13;
            } else if (symbol.equals("A")) {
                power = 14;
            } else {
                power = Integer.parseInt(symbol);
            }
        } else {
            power = 10;
        }
        return power;
    }
}
