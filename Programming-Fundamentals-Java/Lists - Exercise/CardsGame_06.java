import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0) {
            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCards.size(), secondPlayerCard);
                firstPlayerCards.add(firstPlayerCards.size() - 1, firstPlayerCard);
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(Integer.valueOf(secondPlayerCard));
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPlayerCards.size(), firstPlayerCard);
                secondPlayerCards.add(secondPlayerCards.size() - 1, secondPlayerCard);
                secondPlayerCards.remove(0);
                firstPlayerCards.remove(Integer.valueOf(firstPlayerCard));
            } else {
                firstPlayerCards.remove(Integer.valueOf(firstPlayerCard));
                secondPlayerCards.remove(Integer.valueOf(secondPlayerCard));
            }
        }

        if (firstPlayerCards.isEmpty()) {
            System.out.printf("Second player wins! Sum: %d", printSum(secondPlayerCards));
        } else {
            System.out.printf("First player wins! Sum: %d", printSum(firstPlayerCards));
        }
    }

    public static int printSum(List<Integer> list) {
        int sum = 0;

        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }
}
