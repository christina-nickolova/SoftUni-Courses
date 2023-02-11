import java.util.*;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrays = scanner.nextLine().split("\\|");

        List<String[]> numbers = new ArrayList<>();

        for (String currentArray : arrays) {
            String[] array = currentArray.split("\s+");
            numbers.add(array);
        }
        Collections.reverse(numbers);
        StringBuilder result = new StringBuilder();

        for (String[] array : numbers) {

            for (String number : array) {
                result.append(number);
            }
        }

        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i) + " ");
        }
    }
}
