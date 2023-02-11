import java.util.Arrays;
import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstX = Integer.parseInt(scanner.nextLine());
        double firstY = Integer.parseInt(scanner.nextLine());
        double secondX = Integer.parseInt(scanner.nextLine());
        double secondY = Integer.parseInt(scanner.nextLine());
        double thirdX = Integer.parseInt(scanner.nextLine());
        double thirdY = Integer.parseInt(scanner.nextLine());
        double fourthX = Integer.parseInt(scanner.nextLine());
        double fourthY = Integer.parseInt(scanner.nextLine());

        findLongestLine(firstX, firstY, secondX, secondY, thirdX, thirdY, fourthX, fourthY);
    }

    public static void findLongestLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double firstLine = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        double secondLine = Math.sqrt((Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2)));

        if (firstLine >= secondLine) {
            printClosestPoint(x1, y1, x2, y2);
        } else {
            printClosestPoint(x3, y3, x4, y4);
        }
    }

    public static void printClosestPoint(double x1, double y1, double x2, double y2) {
        int[] closestPairArray = new int[2];
        int[] secondPairArray = new int[2];

        double firstPair = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double secondPair = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (firstPair <= secondPair) {
            closestPairArray[0] = (int) x1;
            closestPairArray[1] = (int) y1;
            secondPairArray[0] = (int) x2;
            secondPairArray[1] = (int) y2;
        } else {
            closestPairArray[0] = (int) x2;
            closestPairArray[1] = (int) y2;
            secondPairArray[0] = (int) x1;
            secondPairArray[1] = (int) y1;
        }
        System.out.print(Arrays.toString(closestPairArray).replace("[", "(").replace("]", ")"));
        System.out.println(Arrays.toString(secondPairArray).replace("[", "(").replace("]", ")"));
    }
}
