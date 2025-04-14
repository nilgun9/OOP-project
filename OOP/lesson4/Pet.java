import java.util.Arrays;
import java.util.Objects;
import java.lang.ref.Cleaner;

public class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Species species;

    // Constructors
    public Pet(String nickname, Species species) {
        this.nickname = nickname;
        this.species = species;
        this.habits = new String[]{};
    }

    public Pet(String nickname, int age, int trickLevel, Species species, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.species = species;
        this.habits = habits;
    }

    // Methods
    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }


    public Species getSpecies() { return species; }
    public void setSpecies(Species species) { this.species = species; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getTrickLevel() { return trickLevel; }
    public void setTrickLevel(int trickLevel) { this.trickLevel = trickLevel; }

    public String[] getHabits() { return habits; }
    public void setHabits(String[] habits) { this.habits = habits; }


    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age +
                ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel);
    }

    // Finalizer using Cleaner
    private static final Cleaner cleaner = Cleaner.create();

    public void finalizeObject() {
        Cleaner.Cleanable cleanable = cleaner.register(this,
                () -> System.out.println("Cleaning up resources for: " + this));
        cleanable.clean();
    }

    // Deprecated finalize() method (Only for debugging)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet object is being deleted: " + this);
        super.finalize();
    }
}