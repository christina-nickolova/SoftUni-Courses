import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex >= strings.size()) {
                    endIndex = strings.size() - 1;
                }

                if (isIndexInRange(strings, startIndex) && isIndexInRange(strings, endIndex)) {
                    mergeElements(strings, startIndex, endIndex);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);

                if (isIndexInRange(strings, index)) {
                    int partitions = Integer.parseInt(command.split(" ")[2]);
                    divideElements(strings, index, partitions);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(strings.toString()
                .replaceAll("[\\[\\],]", ""));
    }

    public static void mergeElements(List<String> list, int start, int end) {
        int counter = 0;

        for (int i = start; i < end; i++) {
            list.set(start, list.get(start) + list.get(start + 1));
            list.remove(start + 1);
            i = start - 1;
            counter++;

            if (counter + start == end) {
                break;
            }
        }
    }

    public static void divideElements(List<String> list, int position, int parts) {
        String element = list.get(position);
        list.remove(position);
        int partsLength = element.length() / parts;
        int startIndex = 0;
        int index = position;

        for (int i = 1; i < parts; i++) {
            String currentPart = element.substring(startIndex, startIndex + partsLength);
            list.add(index, currentPart);
            startIndex += partsLength;
            index++;
        }

        list.add(index, element.substring(startIndex));
    }

    public static boolean isIndexInRange(List<String> list, int index) {
        return index >= 0 && index < list.size();
    }
}
