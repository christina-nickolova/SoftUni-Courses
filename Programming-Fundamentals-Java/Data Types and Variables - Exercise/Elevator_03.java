import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfPeople = Byte.parseByte(scanner.nextLine());
        byte elevatorCapacity = Byte.parseByte(scanner.nextLine());

        int courses = (int) Math.ceil((numberOfPeople * 1.0) / elevatorCapacity);

        System.out.println(courses);
    }
}
