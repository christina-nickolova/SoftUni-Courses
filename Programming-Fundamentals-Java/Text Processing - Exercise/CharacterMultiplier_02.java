import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String firstString = input.split(" ")[0];
        String secondString = input.split(" ")[1];

        System.out.println(getSum(firstString, secondString));
    }

    public static int getSum(String first, String second) {
        int totalSum = 0;

        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            int firstSymbol = first.charAt(i);
            int secondSymbol = second.charAt(i);
            totalSum += firstSymbol * secondSymbol;
        }

        if (first.length() > second.length()) {
            String symbolsLeft = first.substring(second.length());

            for (int symbol : symbolsLeft.toCharArray()) {
                totalSum += symbol;
            }
        } else {
            String symbolsLeft = second.substring(first.length());

            for (int symbol : symbolsLeft.toCharArray()) {
                totalSum += symbol;
            }
        }
        return totalSum;
    }
}
