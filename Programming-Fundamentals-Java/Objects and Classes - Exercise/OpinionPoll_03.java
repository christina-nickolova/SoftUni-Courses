import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {
    static class Person {
        String name;
        int age;

        public Person() {

        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        List<Person> persons = new ArrayList<>();

        for (int row = 1; row <= rows; row++) {
            String currentPerson = scanner.nextLine();
            String currentName = currentPerson.split(" ")[0];
            int currentAge = Integer.parseInt(currentPerson.split(" ")[1]);

            if (currentAge > 30) {
                Person person = new Person();
                person.setName(currentName);
                person.setAge(currentAge);

                persons.add(person);
            }
        }

        for (Person currentPerson : persons) {
            System.out.println(currentPerson.getName() + " - " + currentPerson.getAge());
        }
    }
}
