import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondNumbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        List<Integer> mixedLists = new ArrayList<>();
        Collections.reverse(secondNumbersList);

        for (int i = 0; i < Math.min(firstNumbersList.size(), secondNumbersList.size()); i++) {
            mixedLists.add(firstNumbersList.get(i));
            firstNumbersList.remove(i);
            mixedLists.add(secondNumbersList.get(i));
            secondNumbersList.remove(i);
            i = -1;
        }
        int startConst;
        int endConst;

        if (!firstNumbersList.isEmpty()) {
            startConst = firstNumbersList.get(0);
            endConst = firstNumbersList.get(1);
        } else {
            startConst = secondNumbersList.get(0);
            endConst = secondNumbersList.get(1);
        }

        List<Integer> resultNumbers = new ArrayList<>();

        for (Integer number : mixedLists) {

            if (number < Math.max(startConst, endConst) && number > Math.min(startConst, endConst)) {
                resultNumbers.add(number);
            }
        }
        Collections.sort(resultNumbers);
        System.out.println(resultNumbers.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
