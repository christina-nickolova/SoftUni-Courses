import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] studentData = scanner.nextLine().split("\\s+");
            String name = studentData[0];
            double grade = Double.parseDouble(studentData[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " -> ");

            List<Double> studentGrades = entry.getValue();

            double sum = 0;

            for (Double grade : studentGrades) {
                sum += grade;
                System.out.printf("%.2f ", grade);
            }
            double average = sum / studentGrades.size();
            System.out.printf("(avg: %.2f)%n", average);
        }
    }
}
