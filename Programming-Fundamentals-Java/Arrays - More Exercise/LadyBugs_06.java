import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] ladyBugsIndexes = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] fieldArray = new int[fieldSize];

        for (int element : ladyBugsIndexes) {

            if (element >= 0 && element <= fieldArray.length - 1) {
                fieldArray[element] = 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            int ladyBugIndex = Integer.parseInt(command.split(" ")[0]);
            String direction = command.split(" ")[1];
            int flyLength = Integer.parseInt(command.split(" ")[2]);

            if (ladyBugIndex >= 0 && ladyBugIndex <= fieldArray.length - 1 && fieldArray[ladyBugIndex] == 1) {
                fieldArray[ladyBugIndex] = 0;

                if (direction.equals("right")) {
                    ladyBugIndex += flyLength;

                    while (ladyBugIndex <= fieldArray.length - 1 && fieldArray[ladyBugIndex] == 1) {
                        ladyBugIndex += flyLength;
                    }

                    if (ladyBugIndex <= fieldArray.length - 1) {
                        fieldArray[ladyBugIndex] = 1;
                    }
                } else if (direction.equals("left")) {
                    ladyBugIndex -= flyLength;

                    while (ladyBugIndex >= 0 && fieldArray[ladyBugIndex] == 1) {
                        ladyBugIndex -= flyLength;
                    }

                    if (ladyBugIndex >= 0) {
                        fieldArray[ladyBugIndex] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(fieldArray).replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}
