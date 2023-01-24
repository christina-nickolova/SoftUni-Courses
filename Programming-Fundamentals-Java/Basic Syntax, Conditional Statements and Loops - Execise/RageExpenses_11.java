import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headSetsCount = lostGamesCount / 2;
        int mousesCount = lostGamesCount / 3;
        int keyboardsCount = lostGamesCount / 6;
        int displaysCount = lostGamesCount / 12;

        double totalExpenses = (headSetsCount * headsetPrice) + (mousesCount * mousePrice) +
                (keyboardsCount * keyboardPrice) + (displaysCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
