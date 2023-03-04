import java.text.DecimalFormat;
import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(student, new ArrayList<>());
            students.get(student).add(grade);
        }
        LinkedHashMap<String, Double> bestStudents = new LinkedHashMap<>();

        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            String name = entry.getKey();
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            if (average >= 4.5) {
                bestStudents.put(name, average);
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        bestStudents.forEach((key, value) -> System.out.println(key + " -> " + df.format(value)));
    }
}
