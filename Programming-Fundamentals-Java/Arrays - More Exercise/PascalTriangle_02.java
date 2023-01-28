import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(array[i] + " ");
                array[i] = array[i] * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
