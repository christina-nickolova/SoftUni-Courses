import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfLines = Byte.parseByte(scanner.nextLine());

        short sum = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int letter = scanner.nextLine().charAt(0);
            sum = (short) (sum + letter);
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
