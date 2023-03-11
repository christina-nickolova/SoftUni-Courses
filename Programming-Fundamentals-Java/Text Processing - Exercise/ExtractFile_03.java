import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");

        for (String element : path) {

            if (element.contains(".")) {
                String[] elements = element.split("\\.");
                System.out.printf("File name: %s%n", elements[0]);
                System.out.printf("File extension: %s%n", elements[1]);
            }
        }
    }
}
