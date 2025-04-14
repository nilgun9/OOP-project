import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(101);
        int[] guesses = new int[101];
        int attempts = 0;

        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        while (true)
        {
            System.out.print("Enter your number: ");

            while (!scanner.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }

            int userNumber = scanner.nextInt();

            boolean alreadyEntered = false;
            for (int i = 0; i < attempts; i++)
            {
                if (guesses[i] == userNumber)
                {
                    alreadyEntered = true;
                    break;
                }
            }

            if (alreadyEntered)
            {
                System.out.println("You have entered this number before. Try a different one.");
                continue;
            }

            guesses[attempts] = userNumber;
            attempts++;

            if (userNumber < targetNumber)
            {
                System.out.println("Your number is too small. Please, try again.");
            }
            else if (userNumber > targetNumber)
            {
                System.out.println("Your number is too big. Please, try again.");
            }
            else
            {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.print("Your numbers: ");
        int[] userGuesses = Arrays.copyOf(guesses, attempts);
        Arrays.sort(userGuesses);
        for (int i = userGuesses.length - 1; i >= 0; i--)
        {
            System.out.print(userGuesses[i] + " ");
        }
        System.out.println();
    }
}