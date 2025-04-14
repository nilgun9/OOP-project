
public class task4 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[Integer.MAX_VALUE];
        }
        catch (OutOfMemoryError e) {
            System.out.println("Out of memory, array is too big!");
        }
    }
}
