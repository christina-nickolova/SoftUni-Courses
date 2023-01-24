import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pounds = Float.parseFloat(scanner.nextLine());

        double dollars = pounds * 1.36;

        System.out.printf("%.3f", dollars);
    }
}
