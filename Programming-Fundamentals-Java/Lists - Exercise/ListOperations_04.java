import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numbers.size(), number);
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                if (isIndexInRange(numbers, index)) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, number);
                }
            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);

                if (isIndexInRange(numbers, index)) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }
            } else if (command.contains("Shift")) {
                int count = Integer.parseInt(command.split(" ")[2]);

                if (command.contains("left")) {
                    shiftListNumbersLeft(numbers, count);
                } else {
                    shiftListNumbersRight(numbers, count);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString()
                .replaceAll("[\\[\\],]", ""));
    }

    public static void shiftListNumbersLeft(List<Integer> list, int count) {

        for (int i = 0; i < count; i++) {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
    }

    public static void shiftListNumbersRight(List<Integer> list, int count) {

        for (int i = 0; i < count; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

    public static boolean isIndexInRange(List<Integer> list, int index) {
        return index < 0 || index >= list.size();
    }
}
