import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = new int[3];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
        }
        printSmallestNumber(numbersArray);
    }

    public static void printSmallestNumber(int[] numbersArr) {
        int smallestNumber = Integer.MAX_VALUE;

        for (int element : numbersArr) {

            if (smallestNumber > element) {
                smallestNumber = element;
            }
        }
        System.out.println(smallestNumber);
    }
}
