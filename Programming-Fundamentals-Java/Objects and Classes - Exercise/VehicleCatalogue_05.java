import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehicles = new ArrayList<>();
        double carsHorsepower = 0;
        double trucksHorsepower = 0;
        int cars = 0;
        int trucks = 0;

        while (!input.equals("End")) {
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsepower = Integer.parseInt(input.split("\\s+")[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            if (type.equals("car")) {
                carsHorsepower += horsepower;
                cars++;
            } else if (type.equals("truck")) {
                trucksHorsepower += horsepower;
                trucks++;
            }
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {

            for (Vehicle currentVehicle : vehicles) {

                if (input.equals(currentVehicle.getModel())) {
                    String currentType = currentVehicle.getType();

                    if (currentType.equals("car")) {
                        currentType = currentType.replace("c", "C");
                    } else {
                        currentType = currentType.replace("t", "T");
                    }
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                            currentType, currentVehicle.getModel(),
                            currentVehicle.getColor(), currentVehicle.getHorsepower());
                    break;
                }
            }
            input = scanner.nextLine();
        }
        double averageCarsHorsepower = 0;

        if (cars > 0) {
         averageCarsHorsepower = carsHorsepower / cars;
        }
        double averageTrucksHorsepower = 0;

        if (trucks > 0) {
            averageTrucksHorsepower = trucksHorsepower / trucks;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucksHorsepower);
    }
}
