import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        TreeMap<String, String> students = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double sum = 0;

            for (double grade : grades) {
                sum += grade;
            }
            double average = sum / grades.length;

            students.putIfAbsent(name, String.valueOf(average));
        }
        students.forEach((key, value) -> System.out.printf("%s is graduated with %s%n", key, value));
    }
}
