package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    public List<Pet> data;
    public int capacity;

    public GroomingSalon(int capacity) {
        data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet) {

        if (data.size() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        Pet pet = null;

        for (Pet currentPet : data) {

            if (currentPet.getName().equals(name) && currentPet.getOwner().equals(owner)) {
                pet = currentPet;
                break;
            }
        }
        return pet;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        List<String> resultList = new ArrayList<>();
        resultList.add("The grooming salon has the following clients:");

        for (Pet pet : data) {
            String currentName = pet.getName();
            String currentOwner = pet.getOwner();
            String currentResult = currentName + " " + currentOwner;
            resultList.add(currentResult);
        }
        return String.join(System.lineSeparator(), resultList);
    }
}
