import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(name);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            int studentsCount = entry.getValue().size();
            System.out.printf("%s: %d%n", entry.getKey(), studentsCount);
            entry.getValue().forEach(e -> System.out.println("-- " + e));
        }
    }
}
