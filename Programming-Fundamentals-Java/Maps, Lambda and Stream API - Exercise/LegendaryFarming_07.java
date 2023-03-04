import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();
        boolean isWin = false;

        while (!isWin) {
            String[] data = input.split("\\s+");

            for (int i = 0; i < data.length - 1; i += 2) {
                String item = data[i + 1].toLowerCase();
                int quantity = Integer.parseInt(data[i]);

                if (materials.containsKey(item)) {
                    materials.put(item, materials.get(item) + quantity);
                } else {
                    junk.putIfAbsent(item, 0);
                    junk.put(item, junk.get(item) + quantity);
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }

            if (!isWin) {
                input = scanner.nextLine();
            }
        }
        materials.forEach((key, value) -> System.out.println(key + ": " + value));
        junk.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
