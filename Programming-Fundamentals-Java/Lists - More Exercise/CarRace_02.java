import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int finish = numbers.size() / 2;
        double firstRacerTime = 0;

        for (int i = 0; i < finish; i++) {
            int currentTime = numbers.get(i);
            firstRacerTime += currentTime;

            if (currentTime == 0) {
                firstRacerTime = firstRacerTime * 0.8;
            }
        }
        double secondRacerTime = 0;

        for (int i = finish + 1; i < numbers.size(); i++) {
            int currentTime = numbers.get(i);
            secondRacerTime += currentTime;

            if (currentTime == 0) {
                secondRacerTime = secondRacerTime * 0.8;
            }
        }

        if (firstRacerTime < secondRacerTime) {
            System.out.printf("The winner is left with total time: %.1f%n", firstRacerTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f%n", secondRacerTime);
        }
    }
}
