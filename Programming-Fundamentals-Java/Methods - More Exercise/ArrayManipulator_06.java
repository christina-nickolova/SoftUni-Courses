import java.util.*;
import java.util.stream.Collectors;

public class ArrayManipulator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String inputData = scanner.nextLine();

        while (!inputData.equals("end")) {
            String[] commandParts = inputData.split(" ");

            if (commandParts[0].equals("exchange")) {
                int index = Integer.parseInt(commandParts[1]);

                if (isIndexInRange(numbers, index)) {

                    for (int i = 0; i <= index; i++) {
                        numbers.add(numbers.size(), numbers.get(0));
                        numbers.remove(0);
                    }
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandParts[0].equals("max")) {
                String type = commandParts[1];
                int index = getMaxNumberIndex(numbers, type);

                if (index < 0) {
                    System.out.println("No matches");
                } else {
                    System.out.println(index);
                }
            } else if (commandParts[0].equals("min")) {
                String type = commandParts[1];
                int index = getMinNumberIndex(numbers, type);

                if (index < 0) {
                    System.out.println("No matches");
                } else {
                    System.out.println(index);
                }
            } else if (commandParts[0].equals("first")) {
                int count = Integer.parseInt(commandParts[1]);

                if (count > numbers.size()) {
                    System.out.println("Invalid count");
                } else {
                    String type = commandParts[2];
                    getCountElements(numbers, type, count, commandParts[0]);
                }
            } else if (commandParts[0].equals("last")) {
                int count = Integer.parseInt(commandParts[1]);

                if (count > numbers.size()) {
                    System.out.println("Invalid count");
                } else {
                    String type = commandParts[2];
                    Collections.reverse(numbers);
                    getCountElements(numbers, type, count, commandParts[0]);
                    Collections.reverse(numbers);
                }
            }
            inputData = scanner.nextLine();
        }
        System.out.println(numbers);
    }

    public static boolean isIndexInRange(List<Integer> list, int index) {
        return index >= 0 && index < list.size();
    }

    public static void getCountElements(List<Integer> list, String type, int count, String countType) {
        List<Integer> result = new ArrayList<>();

        if (type.equals("even")) {

            for (Integer number : list) {

                if (number % 2 == 0) {
                    result.add(number);
                }

                if (result.size() == count) {
                    break;
                }
            }
        } else if (type.equals("odd")) {

            for (Integer number : list) {

                if (number % 2 != 0) {
                    result.add(number);
                }

                if (result.size() == count) {
                    break;
                }
            }
        }

        if (result.isEmpty()) {
            System.out.println("[]");
        } else {

            if (countType.equals("last")) {
                Collections.reverse(result);
                System.out.println(result);
            } else {
                System.out.println(result);
            }
        }
    }

    public static int getMaxNumberIndex(List<Integer> list, String type) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;

        if (type.equals("even")) {

            for (Integer number : list) {

                if (number % 2 == 0) {

                    if (maxNumber <= number) {
                        maxNumber = number;
                        index = list.lastIndexOf(maxNumber);
                    }
                }
            }
        } else if (type.equals("odd")) {

            for (Integer number : list) {

                if (number % 2 != 0) {

                    if (maxNumber <= number) {
                        maxNumber = number;
                        index = list.lastIndexOf(maxNumber);
                    }
                }
            }
        }
        return index;
    }

    public static int getMinNumberIndex(List<Integer> list, String type) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;

        if (type.equals("even")) {

            for (Integer number : list) {

                if (number % 2 == 0) {

                    if (minNumber >= number) {
                        minNumber = number;
                        index = list.lastIndexOf(minNumber);
                    }
                }
            }
        } else if (type.equals("odd")) {

            for (Integer number : list) {

                if (number % 2 != 0) {

                    if (minNumber >= number) {
                        minNumber = number;
                        index = list.lastIndexOf(minNumber);
                    }
                }
            }
        }
        return index;
    }
}
