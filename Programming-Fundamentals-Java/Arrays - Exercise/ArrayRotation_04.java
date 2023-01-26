import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArray = scanner.nextLine().split(" ");
        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        int position = 0;

        while (numberOfRotations > 0) {
        String firstElement = numbersArray[position];

            System.arraycopy(numbersArray, 1, numbersArray, 0, numbersArray.length - 1);
            numbersArray[numbersArray.length - 1] = firstElement;

            numberOfRotations--;
        }
        System.out.println(String.join(" ", numbersArray));
    }
}
