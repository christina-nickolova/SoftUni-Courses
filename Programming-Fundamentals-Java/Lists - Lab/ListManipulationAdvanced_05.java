import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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

            if (command.contains("Contains")) {
                int number = Integer.parseInt(command.split(" ")[1]);

                if (numbers.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.contains("Print") && command.contains("even")) {
                printEvenNumbers(numbers);
            } else if (command.contains("Print") && command.contains("odd")) {
                printOddNumbers(numbers);
            } else if (command.contains("Get sum")) {
                printNumbersSum(numbers);
            } else if (command.contains("Filter")) {
                int number = Integer.parseInt(command.split(" ")[2]);

                if (command.contains("<") && command.contains("=")) {
                    printBiggerOrEqualNumbers(numbers, number);
                } else if (command.contains(">") && command.contains("=")) {
                    printSmallerOrEqualNumbers(numbers, number);
                } else if (command.contains("<")) {
                    printBiggerNumbers(numbers, number);
                } else if (command.contains(">")) {
                    printSmallerNumbers(numbers, number);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replace("[", "")
                .replace(",", "").replace("]", ""));
    }

    public static void printEvenNumbers(List<Integer> list) {

        for (int number : list) {

            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(List<Integer> list) {

        for (int number : list) {

            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printNumbersSum(List<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    public static void printBiggerOrEqualNumbers(List<Integer> list, int number) {

        for (int num : list) {

            if (num <= number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printSmallerOrEqualNumbers(List<Integer> list, int number) {

        for (int num : list) {

            if (num >= number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printBiggerNumbers(List<Integer> list, int number) {

        for (int num : list) {

            if (num < number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printSmallerNumbers(List<Integer> list, int number) {

        for (int num : list) {

            if (num > number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
