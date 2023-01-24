import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalMoney = 0;

        while (!input.equals("Start")) {
            double insertedCoins = Double.parseDouble(input);

            if (insertedCoins != 0.1 && insertedCoins != 0.2 && insertedCoins != 0.5 && insertedCoins != 1 && insertedCoins != 2) {
                System.out.printf("Cannot accept %.2f%n", insertedCoins);
                input = scanner.nextLine();
                continue;
            }
            totalMoney = totalMoney + insertedCoins;

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        double price;

        while (!input.equals("End")) {

            if (input.equals("Nuts")) {
                price = 2;
            } else if (input.equals("Water")) {
                price = 0.7;
            } else if (input.equals("Crisps")) {
                price = 1.5;
            } else if (input.equals("Soda")) {
                price = 0.8;
            } else if (input.equals("Coke")) {
                price = 1;
            } else {
                System.out.println("Invalid product");
                input = scanner.nextLine();
                continue;
            }

            if (price > totalMoney) {
                System.out.println("Sorry, not enough money");
            } else {
                System.out.printf("Purchased %s%n", input);
                totalMoney = totalMoney - price;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", totalMoney);
    }
}
