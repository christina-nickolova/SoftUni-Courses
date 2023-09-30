import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> users = new TreeMap<>();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String[] ipTokens = tokens[0].split("=");
            String ip = ipTokens[1];
            String[] userTokens = tokens[2].split("=");
            String username = userTokens[1];

            users.putIfAbsent(username, new LinkedHashMap<>());
            users.get(username).putIfAbsent(ip, 0);
            int oldValue = users.get(username).get(ip);
            users.get(username).put(ip, oldValue + 1);
            input = scanner.nextLine();
        }
        users.forEach((key, value) -> {
            System.out.println(key + ": ");

            int counter = 0;

            for (Map.Entry<String, Integer> entry : value.entrySet()) {

                if (counter == value.size() - 1) {
                    System.out.println(entry.getKey() + " => " + entry.getValue() + ".");
                } else {
                    System.out.print(entry.getKey() + " => " + entry.getValue() + ", ");
                }
                counter++;
            }
        });
    }
}
