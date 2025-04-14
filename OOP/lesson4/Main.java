public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Rock", Species.DOG);
        Human mother = new Human("Jane", "Karleone", 1977, 90);
        Human father = new Human("Vito", "Karleone", 1975, 85);
        Family family = new Family(mother, father);
        family.addChild(new Human("Michael", "Karleone", 1995, 110));

        System.out.println(family);
        family.countFamily();


        for (int i = 10_000; i < 10_000_000; i++) {
            new Human("name" + i, "surname" + i, 2000 + i);
        }

        System.gc();


        pet1 = null;
        System.gc();
    }
}