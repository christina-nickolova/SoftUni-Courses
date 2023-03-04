import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            boolean isContained = false;

            if (input.contains("|")) {
                String[] data = input.split(" \\| ");
                String side = data[0];
                String user = data[1];

                forceBook.putIfAbsent(side, new ArrayList<>());

                for (List<String> list : forceBook.values()) {

                    if (list.contains(user)) {
                        isContained = true;
                        break;
                    }
                }

                if (!isContained) {
                    forceBook.get(side).add(user);
                }
            } else if (input.contains("->")) {
                String[] data = input.split(" -> ");
                String side = data[1];
                String user = data[0];

                forceBook.putIfAbsent(side, new ArrayList<>());

                for (List<String> list : forceBook.values()) {

                    if (list.contains(user)) {
                        isContained = true;
                        forceBook.get(side).add(user);
                        list.remove(user);
                    }
                }

                if (!isContained) {
                    forceBook.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            input = scanner.nextLine();
        }
        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(e -> System.out.println("! " + e));
                });
    }
}
