import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        int totalPower = 0;

        for (int i = 0; i < sb.length(); i++) {
            char currentSymbol = sb.charAt(i);

            if (currentSymbol == '>') {
                int currentPower = Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
                totalPower += currentPower;
            } else if (totalPower > 0) {
                sb.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
