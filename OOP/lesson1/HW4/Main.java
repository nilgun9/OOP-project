public class main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.sleep();
        dog.run();

        cat.makeSound();
        cat.sleep();
        cat.scream();
    }
}