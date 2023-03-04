import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(resource, 0);
            resources.put(resource, resources.get(resource) + quantity);

            input = scanner.nextLine();
        }
        resources.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
