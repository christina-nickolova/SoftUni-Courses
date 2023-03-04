import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> studentsPoints = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> studentsSubmissions = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String username = data[0];

            if (data.length != 2) {
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                studentsPoints.putIfAbsent(username, 0);

                if (studentsPoints.get(username) < points) {
                    studentsPoints.put(username, points);
                }
                studentsSubmissions.putIfAbsent(language, 0);
                studentsSubmissions.put(language, studentsSubmissions.get(language) + 1);
            } else {
                studentsPoints.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results: ");
        studentsPoints.forEach((key, value) -> System.out.printf("%s | %d%n", key, value));
        System.out.println("Submissions: ");
        studentsSubmissions.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
    }
}
