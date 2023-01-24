import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        double price;
        double spentMoney = 0;
        boolean areMoneyLeft = true;

        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }

            if (currentBalance < price) {
                System.out.println("Too Expensive");
                input = scanner.nextLine();
                continue;
            }
            currentBalance = currentBalance - price;
            spentMoney = spentMoney + price;
            System.out.println("Bought " + input);

            if (currentBalance <= 0) {
                areMoneyLeft = false;
                System.out.println("Out of money!");
                break;
            }

            input = scanner.nextLine();
        }

        if (areMoneyLeft) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, currentBalance);
        }
    }
}
