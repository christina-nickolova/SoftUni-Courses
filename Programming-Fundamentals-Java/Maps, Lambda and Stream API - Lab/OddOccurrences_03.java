import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : wordsArr) {
            word = word.toLowerCase();
            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word, wordsMap.get(word) + 1);
        }
        List<String> wordsList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                wordsList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", wordsList));
    }
}
