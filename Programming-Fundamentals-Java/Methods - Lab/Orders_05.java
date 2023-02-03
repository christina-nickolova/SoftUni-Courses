import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printTotalPrice(productInput, quantity);
    }

    public static void printTotalPrice(String product, double amount) {
        double totalPrice = 0;

        switch (product) {
            case "coffee":
                totalPrice = amount * 1.5;
                break;
            case "water":
                totalPrice = amount;
                break;
            case "coke":
                totalPrice = amount * 1.4;
                break;
            case "snacks":
                totalPrice = amount * 2;
                break;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
