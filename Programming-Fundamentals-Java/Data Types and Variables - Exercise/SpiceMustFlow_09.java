import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long startYield = Long.parseLong(scanner.nextLine());

        int days = 0;
        long totalAmount = 0;

        while (startYield >= 100) {
            days++;
            totalAmount = totalAmount + startYield;
            totalAmount = totalAmount - 26;

            startYield = startYield - 10;
        }

        if (totalAmount - 26 < 0) {
            totalAmount = 0;
        } else {
            totalAmount = totalAmount - 26;
        }
        System.out.println(days);
        System.out.println(totalAmount);
    }
}
