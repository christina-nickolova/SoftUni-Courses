import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guest = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!guest.equals("PARTY")) {
            char firstSymbol = guest.charAt(0);

            if (Character.isDigit(firstSymbol)) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }
            guest = scanner.nextLine();
        }
        guest = scanner.nextLine();

        while (!guest.equals("END")) {
            vip.remove(guest);
            regular.remove(guest);
            guest = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());

        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
