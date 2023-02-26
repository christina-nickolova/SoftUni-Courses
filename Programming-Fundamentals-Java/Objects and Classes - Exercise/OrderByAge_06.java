import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_06 {
    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> persons = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        while (!input.equals("End")) {
            String name = input.split("\\s+")[0];
            String id = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person person = new Person(name, id, age);
            persons.add(person);
            ages.add(age);

            input = scanner.nextLine();
        }
        Collections.sort(ages);

        for (int currentAge : ages) {

            for (Person currentPerson : persons) {

                if (currentAge == currentPerson.getAge()) {
                    System.out.printf("%s with ID: %s is %d years old.%n", currentPerson.getName(), currentPerson.getId(), currentPerson.getAge());
                }
            }
        }
    }
}
