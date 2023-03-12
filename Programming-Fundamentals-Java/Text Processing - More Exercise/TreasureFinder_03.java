import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] keys = scanner.nextLine().split("\\s+");
        String message = scanner.nextLine();

        while (!message.equals("find")) {
            StringBuilder result = new StringBuilder();
            int counter = -1;

            for (int i = 0; i < message.length(); i++) {
               char currentSymbol = message.charAt(i);
               counter++;
               int currentKey = Integer.parseInt(keys[counter]);

               if (counter == keys.length - 1) {
                   counter = -1;
               }
               currentSymbol -= currentKey;
               result.append(currentSymbol);
            }
            String type = result.substring(result.indexOf("&") + 1, result.lastIndexOf("&"));
            String coordinates = result.substring(result.indexOf("<") + 1, result.indexOf(">"));
            System.out.printf("Found %s at %s%n", type, coordinates);
            message = scanner.nextLine();
        }
    }
}
