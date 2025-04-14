public class FamilyTest {
    public static void main(String[] args) {
        testAddChild();
        testDeleteChild();
    }

    public static void testAddChild() {
        Family family = new Family(new Human("Jane", "Karleone", 1977, 90),
                new Human("Vito", "Karleone", 1975, 95));

        Human child = new Human("Michael", "Karleone", 1995, 110);
        family.addChild(child);

        if (family.countFamily() == 3) {
            System.out.println("testAddChild PASSED");
        } else {
            System.out.println("testAddChild FAILED");
        }
    }

    public static void testDeleteChild() {
        Family family = new Family(new Human("Jane", "Karleone", 1977, 90),
                new Human("Vito", "Karleone", 1975, 95));

        Human child = new Human("Michael", "Karleone", 1995, 110);
        family.addChild(child);
        boolean removed = family.deleteChild(child);

        if (removed && family.countFamily() == 2) {
            System.out.println("testDeleteChild PASSED");
        } else {
            System.out.println("testDeleteChild FAILED");
        }
    }
}