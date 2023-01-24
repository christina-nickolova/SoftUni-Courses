import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int times = 1;
        int product;

        while (times <= 10) {
            product = number * times;
            System.out.printf("%d X %d = %d%n", number, times, product);

            times++;
        }
    }
}
