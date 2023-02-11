import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        int[] tribonacciArray = getTribonacci(numberInput);

        System.out.println(Arrays.toString(tribonacciArray).replace("[", "").replace("]", "").replaceAll(",", ""));
    }

    public static int[] getTribonacci(int number) {
        int[] tribonacciArray = new int[number];
        int sum = 1;

        for (int i = 0; i < tribonacciArray.length; i++) {
            int counter = 0;

            for (int j = i - 1; j >= 0; j--) {

                if (counter >= 3) {
                    break;
                }
                sum = sum + tribonacciArray[j];
                counter++;
            }
            tribonacciArray[i] = sum;
            sum = 0;
        }
        return tribonacciArray;
    }
}
