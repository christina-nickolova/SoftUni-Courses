import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String firstArrElement : secondArray) {

            for (String secondArrElement : firstArray) {

                if (firstArrElement.equals(secondArrElement)) {
                    System.out.print(firstArrElement + " ");
                }
            }
        }
    }
}
