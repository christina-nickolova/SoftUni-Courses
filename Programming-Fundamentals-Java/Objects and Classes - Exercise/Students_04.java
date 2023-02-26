import java.util.*;

public class Students_04 {
    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        List<Double> grades = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] studentData = scanner.nextLine().split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
            grades.add(grade);
        }
        Collections.sort(grades);
        Collections.reverse(grades);

        for (double currentGrade : grades) {

            for (Student currentStudent : students) {

                if (currentGrade == currentStudent.getGrade()) {
                    System.out.printf("%s %s: %.2f%n", currentStudent.getFirstName(), currentStudent.getLastName(), currentStudent.getGrade());
                }
            }
        }
    }
}
