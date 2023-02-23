import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Random random = new Random();

        for (int i = 0; i < words.size(); i++) {
            int currentWordIndex = random.nextInt(words.size());
            String currentWord = words.get(currentWordIndex);
            System.out.println(currentWord);
            words.remove(currentWord);
            i = -1;
        }
    }
}
