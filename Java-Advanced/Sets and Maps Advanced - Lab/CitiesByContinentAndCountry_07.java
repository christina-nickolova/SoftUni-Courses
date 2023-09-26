import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country, new ArrayList<>());
            continents.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : continents.entrySet()) {
            System.out.println(entry.getKey() + ":");

            LinkedHashMap<String, List<String>> countries = entry.getValue();
            countries.forEach((key, value) -> System.out.printf("  %s -> %s%n", key, value.toString()
                    .replace("[", "").replace("]", "")));
        }
    }
}
