import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chestArray = scanner.nextLine().split("\\|");
        String[] inputArray = scanner.nextLine().split(" ");

        while (!inputArray[0].equals("Yohoho!")) {
            String command = inputArray[0];

            switch (command) {
                case "Loot":
                    int counter = 0;

                    for (int i = 1; i < inputArray.length; i++) {

                        for (String element : chestArray) {

                            if (inputArray[i].equals(element)) {
                                counter++;
                                break;
                            }
                        }
                    }
                    String[] lootArray = new String[chestArray.length + inputArray.length - 1 - counter];
                    int index = 0;

                    for (int i = inputArray.length - 1; i > 0; i--) {
                        boolean isContained = false;

                        for (String element : chestArray) {

                            if (inputArray[i].equals(element)) {
                                isContained = true;
                                break;
                            }
                        }

                        if (!isContained) {
                            lootArray[index] = inputArray[i];
                            index++;
                        }
                    }

                    for (String element : chestArray) {
                        lootArray[index] = element;
                        index++;
                    }
                    chestArray = lootArray;
                    break;
                case "Drop":
                    int position = Integer.parseInt(inputArray[1]);

                    if (position < 0 || position >= chestArray.length - 1) {
                        inputArray = scanner.nextLine().split(" ");
                        continue;
                    }
                    String currentElement = chestArray[position];

                    for (int i = position; i < chestArray.length; i++) {

                        if (i != chestArray.length - 1) {
                            chestArray[i] = chestArray[i + 1];
                        } else {
                            chestArray[i] = currentElement;
                        }
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(inputArray[1]);

                    if (count >= chestArray.length) {

                        for (int i = 0; i < chestArray.length; i++) {

                            if (i == chestArray.length - 1) {
                                System.out.println(chestArray[i]);
                            } else {
                                System.out.print(chestArray[i] + ", ");
                            }
                        }
                        chestArray = new String[0];
                        inputArray = scanner.nextLine().split(" ");
                        continue;
                    }
                    lootArray = new String[chestArray.length - count];

                    for (int i = 0; i < chestArray.length; i++) {

                        if (i < chestArray.length - count) {
                            lootArray[i] = chestArray[i];
                        } else {

                            if (i == chestArray.length - 1) {
                                System.out.println(chestArray[i]);
                            } else {
                                System.out.print(chestArray[i] + ", ");
                            }
                        }
                    }
                    chestArray = lootArray;
                    break;
            }
            inputArray = scanner.nextLine().split(" ");
        }

        if (chestArray.length == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double averageTreasureGain;
            int itemsLength = 0;

            for (String element : chestArray) {
                itemsLength += element.length();
            }
            averageTreasureGain = itemsLength * 1.0 / chestArray.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }
    }
}
