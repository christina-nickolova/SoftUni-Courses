import java.util.Arrays;
import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstX = Integer.parseInt(scanner.nextLine());
        int firstY = Integer.parseInt(scanner.nextLine());
        int secondX = Integer.parseInt(scanner.nextLine());
        int secondY = Integer.parseInt(scanner.nextLine());

        printClosestPoint(firstX, firstY, secondX, secondY);
    }

    public static void printClosestPoint(int x1, int y1, int x2, int y2) {
        int[] closestArray = new int[2];

        int firstDiagonal = Math.abs(x1) + Math.abs(y1);
        int secondDiagonal = Math.abs(x2) + Math.abs(y2);

        if (firstDiagonal <= secondDiagonal) {
            closestArray[0] = x1;
            closestArray[1] = y1;
        } else {
            closestArray[0] = x2;
            closestArray[1] = y2;
        }
        System.out.println(Arrays.toString(closestArray).replace("[", "(").replace("]", ")"));
    }
}
