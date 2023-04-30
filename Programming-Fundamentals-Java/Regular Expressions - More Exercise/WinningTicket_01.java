import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ticketsList = Arrays
                .stream(scanner.nextLine().split("\\s*,\\s+"))
                .collect(Collectors.toList());

        String regex = "[@]{6,10}|[$]{6,10}|[#]{6,10}|[\\^]{6,10}";
        Pattern pattern = Pattern.compile(regex);

        LinkedHashMap<String, String> ticketsMap = new LinkedHashMap<>();
        ticketsList.forEach(e -> ticketsMap.putIfAbsent(e, ""));

        for (String ticket : ticketsList) {

            if (ticket.length() != 20) {
                ticketsMap.put(ticket, "invalid ticket");
                continue;
            }
            String leftHalf = ticket.substring(0, 10);
            String rightHalf = ticket.substring(10);
            Matcher leftMatcher = pattern.matcher(leftHalf);
            Matcher rightMatcher = pattern.matcher(rightHalf);

            if (leftMatcher.find() && rightMatcher.find()) {
                char leftMatchSymbol = leftMatcher.group().charAt(0);
                char rightMatchSymbol = rightMatcher.group().charAt(0);

                if (leftMatchSymbol == rightMatchSymbol) {
                    int matchLength = Math.min(leftMatcher.group().length(), rightMatcher.group().length());
                    String result = String.format("%d%s", matchLength, leftMatchSymbol);

                    if (matchLength < 10) {
                        ticketsMap.put(ticket, result);
                    } else {
                        ticketsMap.put(ticket, result + " Jackpot!");
                    }
                } else {
                    ticketsMap.put(ticket, "no match");
                }
            } else {
                ticketsMap.put(ticket, "no match");
            }
        }
        ticketsMap.forEach((key, value) -> {

            if (value.equals("invalid ticket")) {
                System.out.println("invalid ticket");
            } else {
                System.out.printf("ticket \"%s\" - %s\n", key, value);
            }
        });
    }
}
