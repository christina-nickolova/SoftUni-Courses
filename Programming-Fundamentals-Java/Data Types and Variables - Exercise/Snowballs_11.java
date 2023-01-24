import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte snowballsCount = Byte.parseByte(scanner.nextLine());

        double highestSnowballValue = Double.MIN_VALUE;
        short highestSnowballSnow = 0;
        short highestSnowballTime = 0;
        byte highestSnowballQuality = 0;

        for (int i = 0; i < snowballsCount; i++) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());

            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);

            if (highestSnowballValue < snowballValue) {
                highestSnowballValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",
                highestSnowballSnow,
                highestSnowballTime,
                highestSnowballValue,
                highestSnowballQuality);
    }
}
