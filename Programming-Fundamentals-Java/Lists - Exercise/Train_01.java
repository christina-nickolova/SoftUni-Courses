import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("Add")) {
                int passengers = Integer.parseInt(input.split(" ")[1]);
                wagons.add(wagons.size(), passengers);
            } else {
                int passengers = Integer.parseInt(input.split(" ")[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);

                    if (currentWagon + passengers <= maxCapacity) {
                        wagons.set(i, currentWagon + passengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(wagons.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
