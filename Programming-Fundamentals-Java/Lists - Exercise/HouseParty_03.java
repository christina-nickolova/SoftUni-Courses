import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String input = scanner.nextLine();

            String guest = input.split(" ")[0];

            if (input.contains("not")) {

                if (guests.contains(guest)) {
                    guests.remove(guest);
                } else {
                    System.out.println(guest + " is not in the list!");
                }
            } else {

                if (guests.contains(guest)) {
                    System.out.println(guest + " is already in the list!");
                } else {
                    guests.add(guest);
                }
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
