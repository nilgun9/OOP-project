
import java.util.Scanner;

public class SafeDivision
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        boolean success = false;

        while (!success)
        {
            try
            {
                System.out.print("Enter first integer (a): ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter second integer (b): ");
                b = Integer.parseInt(scanner.nextLine());

                int result = a / b;
                System.out.println("Result of a / b = " + result);
                success = true;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Error: Division by zero is not allowed. Try again.");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error: Please enter valid integers. Try again.");
            }
        }

        scanner.close();
    }
}
