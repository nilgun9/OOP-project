
public class task3 {
    public static void recursiveMethod() {
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        }
        catch (StackOverflowError e) {
            System.out.println("Stack overflow error detected!");
        }
    }
}
