import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(",\\s+");
            String direction = tokens[0];
            String registration = tokens[1];

            if (direction.equals("IN")) {
                parkingLot.add(registration);
            } else if (direction.equals("OUT")) {
                parkingLot.remove(registration);
            }
            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String regNumber : parkingLot) {
                System.out.println(regNumber);
            }
        }
    }
}
