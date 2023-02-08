import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numbers.size(), number);
            } else if (command.split(" ")[0].equals("Remove")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(number));
            } else if (command.contains("RemoveAt")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(index);
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, number);
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replace("[", "")
                .replace(",", "").replace("]", ""));
    }
}
