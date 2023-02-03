import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        double result = getMathPower(numberInput, powerInput);

        System.out.println(df.format(result));
    }

    public static double getMathPower(double number, int power) {
        return Math.pow(number, power);
    }
}
