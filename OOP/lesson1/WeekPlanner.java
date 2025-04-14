import java.util.Scanner;
public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = {
                {"Sunday", "do homework"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "attend meeting; read a book"},
                {"Wednesday", "go jogging; study Java"},
                {"Thursday", "cook dinner; write an article"},
                {"Friday", "visit friends; play football"},
                {"Saturday", "go shopping; relax"}
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < schedule.length; i++) {
                if (input.equals(schedule[i][0].toLowerCase())) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                    found = true;
                    break;
                } else if (input.startsWith("change ") || input.startsWith("reschedule ")) {
                    String day = input.substring(input.indexOf(" ") + 1).trim();
                    for (int j = 0; j < schedule.length; j++) {
                        if (day.equalsIgnoreCase(schedule[j][0])) {
                            System.out.println("Please, input new tasks for " + schedule[j][0] + ":");
                            schedule[j][1] = scanner.nextLine();
                            System.out.println("Tasks updated.");
                            found = true;
                            break;
                        }
                    }
                }
            }

            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}