import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        int position = 1;

        for (String product : products) {
            System.out.println(position + "." + product);
            position++;
        }
    }
}
