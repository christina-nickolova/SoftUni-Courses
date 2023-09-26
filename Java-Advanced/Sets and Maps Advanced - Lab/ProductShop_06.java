import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(",\\s+");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).putIfAbsent(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : shops.entrySet()) {
            System.out.println(entry.getKey() + "->");

            LinkedHashMap<String, Double> products = entry.getValue();
            products.forEach((key, value) -> System.out.printf("Product: %s, Price: %.1f%n", key, value));
        }
    }
}
