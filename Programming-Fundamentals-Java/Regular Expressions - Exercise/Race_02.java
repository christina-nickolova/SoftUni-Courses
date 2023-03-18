import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> participantsList = Arrays.stream(text.split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        String letterRegex = "[A-Za-z]";
        Pattern letterPattern = Pattern.compile(letterRegex);
        String digitRegex = "[0-9]";
        Pattern digitPattern = Pattern.compile(digitRegex);

        LinkedHashMap<String, Integer> participantsMap = new LinkedHashMap<>();
        participantsList.forEach(participant -> participantsMap.put(participant, 0));

        while (!input.equals("end of race")) {
            Matcher letterMatcher = letterPattern.matcher(text);
            StringBuilder name = new StringBuilder();

            while (letterMatcher.find()) {
                name.append(letterMatcher.group());
            }

            int distance = 0;
            Matcher digitMatcher = digitPattern.matcher(text);

            while (digitMatcher.find()) {
                int currentDigit = Integer.parseInt(digitMatcher.group());
                distance += currentDigit;
            }

            if (participantsList.contains(name.toString())) {
                int currentDistance = participantsMap.get(name.toString());
                participantsMap.put(name.toString(), currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        int counter = 1;

        for (Map.Entry<String, Integer> entry : participantsMap.entrySet()) {

            if (counter == 1) {
                System.out.printf("%dst place: %s%n", counter, entry.getKey());
            } else if (counter == 2) {
                System.out.printf("%dnd place: %s%n", counter, entry.getKey());
            } else if (counter == 3) {
                System.out.printf("%drd place: %s%n", counter, entry.getKey());
            }
            counter++;

            if (counter > 3) {
                break;
            }
        }
    }
}
