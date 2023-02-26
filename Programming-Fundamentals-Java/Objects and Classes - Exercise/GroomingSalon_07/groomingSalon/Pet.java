package groomingSalon;

public class Pet {
    public String name;
    public int age;
    public String owner;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        return String.format("%s %d - (%s)", getName(), getAge(), getOwner());
    }
}
