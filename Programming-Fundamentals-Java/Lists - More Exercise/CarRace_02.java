import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int finish = numbers.size() / 2 + 1;

        List<Double> leftTime = numbers.subList(0, finish - 1);
        List<Double> rightTime = numbers.subList(finish, numbers.size());
        Collections.reverse(rightTime);

        double left = getTime(leftTime);
        double right = getTime(rightTime);

        if (left <= right) {
            System.out.printf("The winner is left with total time: %.1f", left);
        } else {
            System.out.printf("The winner is right with total time: %.1f", right);
        }
    }

    public static double getTime(List<Double> list) {
        double totalTime = 0;

        for (Double time : list) {

            if (time == 0) {
                totalTime *= 0.8;
            } else {
                totalTime += time;
            }
        }
        return totalTime;
    }
}
