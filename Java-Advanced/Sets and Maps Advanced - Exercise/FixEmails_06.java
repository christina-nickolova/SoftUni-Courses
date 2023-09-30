import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();

            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")) {
                emails.putIfAbsent(name, "");
                emails.put(name, email);
            }
            input = scanner.nextLine();
        }
        emails.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
