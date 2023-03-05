import java.util.*;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, LinkedHashMap<String, Integer>> students = new TreeMap<>();

        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contests.putIfAbsent(contest, password);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("end of submissions")) {
            String contest = input.split("=>")[0];
            String password = input.split("=>")[1];
            String username = input.split("=>")[2];
            int points = Integer.parseInt(input.split("=>")[3]);

            if (contests.containsKey(contest) && contests.get(contest).equals(password)) {

                if (!students.containsKey(username)) {
                    students.put(username, new LinkedHashMap<>());
                    students.get(username).put(contest, points);
                } else {

                    if (!students.get(username).containsKey(contest)) {
                        students.get(username).put(contest, points);
                    } else {
                        int currentPoints = students.get(username).get(contest);
                        students.get(username).put(contest, Math.max(currentPoints, points));
                    }
                }
            }
            input = scanner.nextLine();
        }
        int maxSum = 0;
        String bestStudent = "";

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : students.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();

            if (maxSum < sum) {
                maxSum = sum;
                bestStudent = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestStudent, maxSum);
        System.out.println("Ranking: ");
        students.forEach((key, value) -> {
            System.out.println(key);
            value.entrySet().stream().sorted((k, v) -> v.getValue() - k.getValue())
                    .forEach(e -> System.out.println("#  " + e.getKey() + " -> " + e.getValue()));
        });
    }
}
