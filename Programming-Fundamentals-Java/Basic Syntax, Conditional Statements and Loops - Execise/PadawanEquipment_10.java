import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int moreLightsabers = (int) Math.ceil(studentsCount * 0.1);
        double lightsabersTotalPrice = lightsaberPrice * (studentsCount + moreLightsabers);
        double robesTotalPrice = robePrice * studentsCount;
        int freeBelts = studentsCount / 6;
        double beltsTotalPrice = beltPrice * (studentsCount - freeBelts);

        double totalMoney = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (amountOfMoney >= totalMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalMoney - amountOfMoney);
        }
    }
}
