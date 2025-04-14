import java.util.Random;
import java.util.Scanner;

public class ShipBattle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int SIZE = 5;
        char[][] grid = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                grid[i][j] = '-';
            }
        }

        // The game will be written with the area-shooting feature (covering 3 adjacent cells)
        boolean isHorizontal = random.nextBoolean();

        int targetRow, targetCol;

        if (isHorizontal)
        {
            targetRow = random.nextInt(SIZE);
            targetCol = random.nextInt(SIZE - 2);
        }
        else
        {
            targetRow = random.nextInt(SIZE - 2);
            targetCol = random.nextInt(SIZE);
        }

        boolean[] targetHit = {false, false, false};

        System.out.println("All set. Get ready to rumble!");

        while (true)
        {
            int row, col;

            while (true)
            {
                System.out.print("Enter row (1-5): ");
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt() - 1;
                    if (row >= 0 && row < SIZE) break;
                } else {
                    scanner.next();
                }
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }

            while (true)
            {
                System.out.print("Enter column (1-5): ");
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt() - 1;
                    if (col >= 0 && col < SIZE) break;
                } else {
                    scanner.next();
                }
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }

            if (grid[row][col] != '-')
            {
                System.out.println("You already shot here! Try again.");
                continue;
            }

            boolean hit = false;
            for (int i = 0; i < 3; i++)
            {
                int targetR = isHorizontal ? targetRow : targetRow + i;
                int targetC = isHorizontal ? targetCol + i : targetCol;

                if (row == targetR && col == targetC)
                {
                    targetHit[i] = true;
                    hit = true;
                    grid[row][col] = 'x';
                    break;
                }
            }

            if (!hit)
            {
                grid[row][col] = '*';
            }

            printGrid(grid);

            if (targetHit[0] && targetHit[1] && targetHit[2])
            {
                System.out.println("You have won!");
                break;
            }
        }
    }

    private static void printGrid(char[][] grid)
    {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < grid.length; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}