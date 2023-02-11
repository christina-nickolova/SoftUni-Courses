import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int integerNumber = Integer.parseInt(scanner.nextLine());
                printResult(integerNumber);
                break;
            case "real":
                double floatingPointNumber = Double.parseDouble(scanner.nextLine());
                printResult(floatingPointNumber);
                break;
            case "string":
                String textInput = scanner.nextLine();
                printResult(textInput);
                break;
        }
    }

    public static void printResult(int number) {
        System.out.println(number * 2);
    }

    public static void printResult(double number) {
        System.out.printf("%.2f", number * 1.5);
    }

    public static void printResult(String text) {
        System.out.println("$" + text + "$");
    }
}
