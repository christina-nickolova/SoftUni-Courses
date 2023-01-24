import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfLines = Byte.parseByte(scanner.nextLine());

        short currentQuantity = 0;

        for (int i = 0; i < numberOfLines; i++) {
            short quantities = Short.parseShort(scanner.nextLine());

            if (currentQuantity + quantities <= 255) {
                currentQuantity = (short) (currentQuantity + quantities);
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentQuantity);
    }
}
