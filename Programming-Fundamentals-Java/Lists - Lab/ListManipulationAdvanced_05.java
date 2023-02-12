import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");



            if (commandParts[0].equals("Contains")) {
                int number = Integer.parseInt(commandParts[1]);

                if (numbers.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (commandParts[0].equals("Print")) {

                if (commandParts[1].equals("even")) {
                    List<Integer> evenNumbers = new ArrayList<>();

                    for (Integer number : numbers) {

                        if (number % 2 == 0) {
                            evenNumbers.add(number);
                        }
                    }
                    System.out.println(evenNumbers.toString().replaceAll("[\\[\\],]", ""));
                } else if (commandParts[1].equals("odd")) {
                    List<Integer> oddNumbers = new ArrayList<>();

                    for (Integer number : numbers) {

                        if (number % 2 != 0) {
                            oddNumbers.add(number);
                        }
                    }
                    System.out.println(oddNumbers.toString().replaceAll("[\\[\\],]", ""));
                }
            } else if (commandParts[0].equals("Get") && commandParts[1].equals("sum")) {
                int sum = 0;

                for (Integer number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (commandParts[0].equals("Filter")) {
                String condition = commandParts[1];
                int number = Integer.parseInt(commandParts[2]);

                List<Integer> integers = new ArrayList<>();

                switch (condition) {
                    case "<":

                        for (Integer integer : numbers) {

                            if (integer < number) {
                                integers.add(integer);
                            }
                        }
                        System.out.println(integers.toString().replaceAll("[\\[\\],]", ""));
                        break;
                    case ">":

                        for (Integer integer : numbers) {

                            if (integer > number) {
                                integers.add(integer);
                            }
                        }
                        System.out.println(integers.toString().replaceAll("[\\[\\],]", ""));
                        break;
                    case ">=":

                        for (Integer integer : numbers) {

                            if (integer >= number) {
                                integers.add(integer);
                            }
                        }
                        System.out.println(integers.toString().replaceAll("[\\[\\],]", ""));
                        break;
                    case "<=":

                        for (Integer integer : numbers) {

                            if (integer <= number) {
                                integers.add(integer);
                            }
                        }
                        System.out.println(integers.toString().replaceAll("[\\[\\],]", ""));
                        break;
                }
            }
            command = scanner.nextLine();
        }
    }
}
