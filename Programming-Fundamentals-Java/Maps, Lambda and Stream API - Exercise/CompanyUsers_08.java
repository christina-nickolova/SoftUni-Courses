import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> employees = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+->\\s+");
            String companyName = data[0];
            String employeeId = data[1];

            employees.putIfAbsent(companyName, new ArrayList<>());

            if (!employees.get(companyName).contains(employeeId)) {
                employees.get(companyName).add(employeeId);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : employees.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(e -> System.out.println("-- " + e));
        }
    }
}
