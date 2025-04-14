public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[3]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't access this element, index is out of bounds!");
        }
    }
}