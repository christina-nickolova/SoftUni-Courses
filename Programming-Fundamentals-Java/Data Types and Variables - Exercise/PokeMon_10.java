import java.math.BigDecimal;
import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long pokePower = Long.parseLong(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactor = Byte.parseByte(scanner.nextLine());

        int pokedTargets = 0;

        BigDecimal exact = new BigDecimal(pokePower);
        exact = exact.multiply(BigDecimal.valueOf(0.5));

        while (pokePower >= distance) {

            if (BigDecimal.valueOf((double) pokePower).equals(exact)) {

                if (exhaustionFactor == 0) {
                    pokePower = pokePower - distance;
                    continue;
                } else {
                    pokePower = pokePower / exhaustionFactor;
                }
            }

            if (pokePower < distance) {
                break;
            }
            pokedTargets++;
            pokePower = pokePower - distance;
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
