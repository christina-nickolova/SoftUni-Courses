import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> productsPrice= new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsQuantity.putIfAbsent(name, 0);
            productsQuantity.put(name, productsQuantity.get(name) + quantity);

            productsPrice.put(name, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            String name = entry.getKey();
            double totalPrice = entry.getValue() * productsPrice.get(name);
            System.out.printf("%s -> %.2f%n", name, totalPrice);
        }
    }
}
