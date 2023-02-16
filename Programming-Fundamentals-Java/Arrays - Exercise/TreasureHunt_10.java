import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "Loot":

                    for (int i = 1; i < commandParts.length; i++) {
                        String currentItem = commandParts[i];

                        if (!chest.contains(currentItem)) {
                            chest.add(0, currentItem);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);

                    if (index >= 0 && index < chest.size()) {
                        String currentItem = chest.get(index);
                        chest.remove(index);
                        chest.add(currentItem);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandParts[1]);

                    if (count < chest.size()) {
                        System.out.println(chest
                                .subList(chest.size() - count, chest.size())
                                .toString().replaceAll("[\\[\\]]", ""));
                        chest.subList(chest.size() - count, chest.size()).clear();
                    } else {
                        System.out.println(chest
                                .toString().replaceAll("[\\[\\]]", ""));
                        chest.clear();
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (chest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int itemsTotalLength = 0;

            for (String item : chest) {
                itemsTotalLength += item.length();
            }
            double average = itemsTotalLength * 1.0 / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }
    }
}
