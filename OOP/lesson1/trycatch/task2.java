public class task2 {
    public static void main(String[] args) {
        int chosenNumber = 150;
        int[] arr = {2, 3, 0, 5, 10};

        for (int number : arr) {
            try {
                int result = chosenNumber / number;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Can't divide by zero, proceeding to the next element!");
            }
        }
    }
}