import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String dataType;

            if (input.matches("-?\\d+")) {
                dataType = "integer";
            } else if (input.matches("-?\\d*[.]\\d+")) {
                dataType = "floating point";
            } else if (input.matches(".")) {
                dataType = "character";
            } else if (input.matches("^(?i:true|false)$")) {
                dataType = "boolean";
            } else {
                dataType = "string";
            }
            System.out.printf("%s is %s type%n", input, dataType);

            input = scanner.nextLine();
        }
    }
}
