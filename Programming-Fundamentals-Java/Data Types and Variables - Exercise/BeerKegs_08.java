import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte kegsCount = Byte.parseByte(scanner.nextLine());

        double biggestKeg = Double.MIN_VALUE;
        String nameOfTheBiggestKeg = "";

        for (int i = 0; i < kegsCount; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            long height = Long.parseLong(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (biggestKeg < volume) {
                biggestKeg = volume;
                nameOfTheBiggestKeg = model;
            }
        }
        System.out.println(nameOfTheBiggestKeg);
    }
}
