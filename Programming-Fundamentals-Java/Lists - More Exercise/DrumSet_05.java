import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        List<Integer> initDrumSet = new ArrayList<>(drumSet);
        double price;

        while (!command.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - hitPower);
            }

            for (int i = 0; i < drumSet.size(); i++) {

                if (drumSet.get(i) <= 0) {
                    price = initDrumSet.get(i) * 3;

                    if (savings - price >= 0) {
                        drumSet.set(i, initDrumSet.get(i));
                        savings -= price;
                    } else {
                        drumSet.remove(drumSet.get(i));
                        initDrumSet.remove(initDrumSet.get(i));
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(drumSet.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.%n", savings);
    }
}
