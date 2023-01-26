import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());

        int[] trainArray = new int[wagonsCount];

        int sum = 0;

        for (int i = 0; i < wagonsCount; i++) {
            trainArray[i] = Integer.parseInt(scanner.nextLine());
            sum += trainArray[i];
        }

        for (int wagon : trainArray) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
