import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int product;
        boolean isBigger = true;

        while (times <= 10) {
            product = number * times;
            System.out.printf("%d X %d = %d%n", number, times, product);

            isBigger = false;
            times++;
        }

        if (isBigger) {
            product = number * times;
            System.out.printf("%d X %d = %d%n", number, times, product);
        }
    }
}
