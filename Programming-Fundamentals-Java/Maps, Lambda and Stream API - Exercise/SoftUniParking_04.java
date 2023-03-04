import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String command = inputData[0];
            String name = inputData[1];

            if (command.equals("register")) {
                String licencePlateNumber = inputData[2];

                if (!parking.containsKey(name)) {
                    parking.put(name, licencePlateNumber);
                    System.out.printf("%s registered %s successfully%n", name, licencePlateNumber);
                } else {
                    System.out.println("ERROR: already registered with plate number " + parking.get(name));
                }
            } else if (command.equals("unregister")) {

                if (!parking.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parking.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }
        parking.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
