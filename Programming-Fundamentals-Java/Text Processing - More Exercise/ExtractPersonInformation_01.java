import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String data = scanner.nextLine();

            String name = data.substring(data.indexOf("@") + 1, data.indexOf("|"));
            String age = data.substring(data.indexOf("#") + 1, data.indexOf("*"));

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
