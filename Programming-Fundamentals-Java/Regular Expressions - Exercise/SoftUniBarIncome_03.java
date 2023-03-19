import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<costumer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.\\d]*(?<price>\\d+.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String costumer = matcher.group("costumer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double currentSum = count * price;
                totalSum += currentSum;

                System.out.printf("%s: %s - %.2f%n", costumer, product, currentSum);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f%n", totalSum);
    }
}
