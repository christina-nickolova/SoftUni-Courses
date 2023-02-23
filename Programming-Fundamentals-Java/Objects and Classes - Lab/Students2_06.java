import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_06 {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student() {

        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAge() {
            return age;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getTown() {
            return town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            String age = studentData[2];
            String town = studentData[3];

            Student person = getStudent(students, firstName, lastName);

            if (person != null) {
                person.setAge(age);
                person.setTown(town);
            } else {
                Student student = new Student();
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setTown(town);

                students.add(student);
            }

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : students) {

            if (student.getTown().equals(city)) {
                String firstName = student.getFirstName();
                String lastName = student.getLastName();
                String age = student.getAge();

                System.out.printf("%s %s is %s years old%n", firstName, lastName, age);
            }
        }
    }

    public static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student student = null;

        for (int i = 0; i < students.size(); i++) {

            if (isStudentExists(students, firstName, lastName)) {
                student = students.get(i);
            }
        }
        return student;
    }

    public static boolean isStudentExists(List<Student> students, String firstName, String lastName) {

        for (Student student : students) {

            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
