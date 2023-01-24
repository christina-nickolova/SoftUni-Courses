import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupPeopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        switch (dayOfWeek) {
            case "Friday":

                switch (groupType) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.9;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":

                switch (groupType) {
                    case "Students":
                        price = 9.8;
                        break;
                    case "Business":
                        price = 15.6;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":

                switch (groupType) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.5;
                        break;
                }
                break;
        }
        double totalPrice = groupPeopleCount * price;

        if (groupType.equals("Students") && groupPeopleCount >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (groupType.equals("Business") && groupPeopleCount >= 100) {
            groupPeopleCount = groupPeopleCount - 10;
            totalPrice = groupPeopleCount * price;
        } else if (groupType.equals("Regular") && groupPeopleCount >= 10 && groupPeopleCount <= 20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}
