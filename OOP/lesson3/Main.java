import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", "Doggy", 3, 80, new String[]{"eat", "drink", "sleep"});
        Pet pet2 = new Pet("cat", "Mestan");
        Pet pet3 =new Pet();

        Human mother = new Human("Estella", "Rzayeva", 1987);
        Human father = new Human("Peter", "Rzayev", 1997);
        Human child = new Human(
                "Aghamirza",
                "Rzayev",
                2015,
                90,
                pet1,
                mother,
                father,
                new String[][] {
                        {"Monday", "Go to gym"},
                        {"Sunday", "Watch movies"}
                }
        );

        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);

        child.greetPet();
        child.describePet();
        pet1.eat();
        boolean isFeedingTime = new Random().nextBoolean();
        child.feedPet(isFeedingTime);
    }
}