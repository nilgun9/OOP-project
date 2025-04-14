import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    Human mother;
    Human father;
    String[][] schedule;
    Pet pet;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
        this.pet = pet;
    }

    void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    void describePet() {
        String sly = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + " who is " + pet.age + " years old, she is " + sly);
    }

    public boolean feedPet(boolean isTimeToFeed) {
        if (isTimeToFeed) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(100);
            if (pet.trickLevel > randomValue) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                return true;
            } else {
                System.out.println("I think " + name + "'s " + pet.species + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name : "null") +
                ", father=" + (father != null ? father.name : "null") +
                ", pet=" + pet + "}";
    }
}